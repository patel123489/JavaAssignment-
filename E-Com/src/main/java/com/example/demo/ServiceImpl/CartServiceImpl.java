package com.example.demo.ServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.CartDto;
import com.example.demo.Model.Cart;
import com.example.demo.Model.User;
import com.example.demo.Repo.CartRepo;
import com.example.demo.Service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepo cartRepository;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public CartDto create(CartDto dto) {
		
		Cart c = mapper.map(dto, Cart.class);	
		return mapper.map(cartRepository.save(c), CartDto.class);
	}

	@Override
	public CartDto cartByUser(User user) {
		
		CartDto dt = null;
		Cart c = cartRepository.findByUserId(user);
		if(c!=null)
		{
			dt = mapper.map(c, CartDto.class);
		}
		return dt;
	}

	@Override
	public void delete(Long id) {
		cartRepository.deleteById(id);		
	}

}