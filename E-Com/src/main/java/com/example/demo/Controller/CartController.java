package com.example.demo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.CartDto;
import com.example.demo.Dto.CartItemDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Model.User;
import com.example.demo.Service.CartItemService;
import com.example.demo.Service.CartService;
import com.example.demo.Service.ProductService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/carts")
public class CartController {
	
		@Autowired
		CartService cartService;
		
		@Autowired
		UserService service;
		
		@Autowired
		ModelMapper mapper;
		
		@Autowired
		ProductService productService;
		
		@Autowired
	    CartItemService cartitemservice;
		
		@PostMapping("/")
		public ResponseEntity<CartItemDto> create(@RequestBody CartItemDto dto,@RequestParam("product") Long Id)
		{
			
			dto.setProduct(productService.retrive(Id));
			
			UserDto user = service.retrive(2l);
			
			CartDto isExist =   cartService.cartByUser(mapper.map(user, User.class));
			if(isExist==null)
			{
				CartDto ct = new CartDto();
				ct.setUser(user);
				isExist =  cartService.create(ct);
			}
			
			dto.setCart(isExist);
			
			CartItemDto created = cartitemservice.create(dto);
			
			return new ResponseEntity<>(created,HttpStatus.CREATED); 
			
		}
		
		@GetMapping("/")
		public ResponseEntity<CartDto> retrive()
		{
			UserDto user = service.retrive(2l);
			CartDto c =  cartService.cartByUser(mapper.map(user, User.class));
		
			return new ResponseEntity<>(c,HttpStatus.OK);
		}
}