package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.RoleDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Repo.CartItemRepo;
import com.example.demo.Service.RoleService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CartItemRepo cartItemRepository;

		@Autowired
		RoleService roleService;
		
		@Autowired
		UserService service;

		UserController(CartItemRepo cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }
	
		@PostMapping("/")
		public ResponseEntity<UserDto> create(@RequestBody UserDto dto,@RequestParam("role") Long rid)
		{
			dto.setRole(roleService.retrive(rid));
			UserDto createUser =  service.create(dto);
			return new ResponseEntity<>(createUser,HttpStatus.CREATED);			
		}
		
		@GetMapping("/")
		public ResponseEntity<List<UserDto>> list()
		{
			List<UserDto> all = service.list();
			return new ResponseEntity<>(all,HttpStatus.OK);
		}
		
		@PutMapping("/{id}")
		public ResponseEntity<UserDto> update(@RequestBody UserDto dto,@PathVariable("id") Long id,@RequestParam("role") Long rid)
		{
			dto.setRole(roleService.retrive(rid));
			UserDto updated = service.update(dto, id);
			
			return new ResponseEntity<>(updated,HttpStatus.CREATED);
			
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity delete(@PathVariable("id") Long id)
		{
			service.delete(id);
			return new ResponseEntity("Deleted Successfully",HttpStatus.OK);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<UserDto> retrive(@PathVariable("id") Long id)
		{
			UserDto user = service.retrive(id);
			return new ResponseEntity<>(user,HttpStatus.OK);
		}
		
}
