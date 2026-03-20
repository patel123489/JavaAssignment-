package com.example.demo.Service;

import com.example.demo.Dto.CartDto;
import com.example.demo.Model.Cart;
import com.example.demo.Model.User;

public interface CartService {
		public CartDto create(CartDto dto);
		public CartDto cartByUser(User user);
		public void delete(Long id);
}