package com.example.demo.ServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.CartItemDto;
import com.example.demo.Model.CartItem;
import com.example.demo.Repo.CartItemRepo;
import com.example.demo.Service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {
	
	@Autowired
	CartItemRepo cartItemRepository;
	
	@Autowired
	ModelMapper mapper;

	@Override
	public CartItemDto create(CartItemDto dto) {
		
		
		CartItem item = mapper.map(dto, CartItem.class);
		CartItem created = cartItemRepository.save(item);
		return mapper.map(created, CartItemDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cartItemRepository.deleteById(id);
	}

}