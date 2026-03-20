package com.example.demo.Service;

import com.example.demo.Dto.CartItemDto;

public interface CartItemService {

	public CartItemDto create(CartItemDto dto);
	public void delete(Long id);
}