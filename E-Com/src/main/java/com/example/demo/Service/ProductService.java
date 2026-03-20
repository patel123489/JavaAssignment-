package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.ProductDto;
import com.example.demo.Model.Product;

public interface ProductService {

	public ProductDto create(ProductDto dto);
	public List<ProductDto> list();
	public ProductDto retrive(Long id);
	public ProductDto update(ProductDto dto,Long id);
	public void delete(Long id);
	
}