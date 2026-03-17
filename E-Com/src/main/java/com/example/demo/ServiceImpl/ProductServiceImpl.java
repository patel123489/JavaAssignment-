package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.CategoryDto;
import com.example.demo.Dto.ProductDto;
import com.example.demo.Model.Category;
import com.example.demo.Model.Product;
import com.example.demo.payload.ResourceNotFoundException;
import com.example.demo.Repo.ProductRepo;
import com.example.demo.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public ProductDto create(ProductDto dto) {
		Product product=mapper.map(dto, Product.class);
		Product createdProduct=repo.save(product);
		return mapper.map(createdProduct, ProductDto.class);
	}

	@Override
	public List<ProductDto> list() {
		
		List<Product> all=repo.findAll();
		List<ProductDto> dtos=all.stream().map(p->{
			return mapper.map(p, ProductDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public ProductDto retrive(Long id) {
		Product p=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "ID", id));
		return mapper.map(p, ProductDto.class);
	}

	@Override
	public ProductDto update(ProductDto dto, Long id) {
		// TODO Auto-generated method stub
		Product p=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "ID", id));
		p.setName(dto.getName());
		p.setDescription(dto.getDescription());
		p.setPrice(dto.getPrice());
		p.setStockQty(dto.getStockQty());
		p.setImage(dto.getImage());
		p.setActive(true);
		p.setCreatedAt(dto.getCreatedAt());
		p.setCategroy(mapper.map(dto.getCategory(), Category.class));
		return mapper.map(repo.save(p), ProductDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Product p=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "ID", id));
		repo.delete(p);
		
	}

}