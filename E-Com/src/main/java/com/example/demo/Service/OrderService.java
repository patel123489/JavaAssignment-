package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.OrderDto;
import com.example.demo.Dto.OrderItemDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Model.OrderItem;

public interface OrderService {

	public OrderDto create(OrderDto dto);
	public OrderItemDto create(OrderItemDto dto);
	public List<OrderDto> list(UserDto dto);
}