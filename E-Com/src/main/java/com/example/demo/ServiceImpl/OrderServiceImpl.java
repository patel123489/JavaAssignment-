package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.OrderDto;
import com.example.demo.Dto.OrderItemDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Model.Order;
import com.example.demo.Model.OrderItem;
import com.example.demo.Model.User;
import com.example.demo.Repo.OrderItemRepo;
import com.example.demo.Repo.OrderRepo;
import com.example.demo.Service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepository;
	
	@Autowired
	OrderItemRepo itemRepository;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public OrderDto create(OrderDto dto) {
		
		Order created = orderRepository.save(mapper.map(dto, Order.class));
		return mapper.map(created, OrderDto.class);
	}

	@Override
	public OrderItemDto create(OrderItemDto dto) {
		
		OrderItem created = itemRepository.save(mapper.map(dto, OrderItem.class));
		return mapper.map(created, OrderItemDto.class);
	}

	@Override
	public List<OrderDto> list(UserDto dto) {
		
		List<Order> orders = orderRepository.findByUser(mapper.map(dto, User.class));
		List<OrderDto> items = 
				orders.stream().map(ord->{
					return mapper.map(ord,OrderDto.class);
				}).collect(Collectors.toList());
				
		return items;
	}

}