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

import com.example.demo.Dto.ProductDto;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService service;
	
	
	@PostMapping("/")
	public ResponseEntity<ProductDto> create(@RequestBody ProductDto dto,@RequestParam("cat") Long cid) {
		
		dto.setCategory(categoryService.retrive(cid));
		ProductDto createdProduct=service.create(dto);
		return new ResponseEntity<>(createdProduct,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<ProductDto>> list() {
		
		List<ProductDto> all=service.list();
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> retrive(@PathVariable("id") Long id) {
		
		ProductDto products=service.retrive(id);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProductDto> update(@RequestBody ProductDto dto,@RequestParam("cat") Long cid,@PathVariable("id") Long id) {
		
		dto.setCategory(categoryService.retrive(cid));
		ProductDto updated=service.update(dto, id);
		return new ResponseEntity<>(updated,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		return new ResponseEntity<>("delete successfullay",HttpStatus.OK);
	}

}