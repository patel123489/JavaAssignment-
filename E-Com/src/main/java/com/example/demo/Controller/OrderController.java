package com.example.demo.Controller;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
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

import com.example.demo.Dto.AddressDto;
import com.example.demo.Dto.CartDto;
import com.example.demo.Dto.CartItemDto;
import com.example.demo.Dto.CartItemDtoview;
import com.example.demo.Dto.OrderDto;
import com.example.demo.Dto.OrderItemDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Model.Cart;
import com.example.demo.Model.User;
import com.example.demo.Service.AddressService;
import com.example.demo.Service.CartItemService;
import com.example.demo.Service.CartService;
import com.example.demo.Service.OrderService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
		@Autowired
		UserService service;
		
		@Autowired
		AddressService addressService;
		
		@Autowired
		OrderService orderService;
		
		@Autowired
		CartService cartService;
		
		@Autowired
		ModelMapper mapper;
	
		@Autowired
		CartItemService cartItemService;
		
		@PostMapping("/")
		public void create(@RequestBody OrderDto dto,@RequestParam("address") Long aid)
		{
			AddressDto address = addressService.retrive(aid);
			UserDto user = service.retrive(2l);
			dto.setUser(user);
			dto.setAddress(address);
			
			OrderDto createdOrder =  orderService.create(dto);
			CartDto cart = cartService.cartByUser(mapper.map(user, User.class));
			
			OrderItemDto odto = new OrderItemDto();
			for(CartItemDtoview cartitem : cart.getItems()) 
			{
				odto.setOrder(createdOrder);
				odto.setProduct(cartitem.getProduct());
				odto.setQty(cartitem.getQty());
				odto.setPrice(cartitem.getProduct().getPrice());
				
				orderService.create(odto);
				
				cartItemService.delete(cartitem.getId());
			}
			cartService.delete(cart.getId());	
		}
		
		@GetMapping("/")
		public ResponseEntity<List<OrderDto>> list()
		{
			UserDto dto = service.retrive(2l);
			List<OrderDto> all =  orderService.list(dto);
			
			return new ResponseEntity<>(all,HttpStatus.OK);
		}
}