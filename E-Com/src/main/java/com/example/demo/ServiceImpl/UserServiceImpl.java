package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Model.Role;
import com.example.demo.Model.User;
import com.example.demo.payload.ResourceNotFoundException;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public UserDto create(UserDto dto) {
		
		User user=mapper.map(dto, User.class);
		User createdUser=repo.save(user); 
		return mapper.map(createdUser, UserDto.class);
	}

	@Override
	public List<UserDto> list() {
		
		List<User> all=repo.findAll();
		List<UserDto> dtos=all.stream().map(u->{
			return mapper.map(u, UserDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public UserDto retrive(Long id) {
		
		User u=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "ID", id));
		return mapper.map(u, UserDto.class);
	}

	@Override
	public UserDto update(UserDto dto, Long id) {
		User u=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "ID", id));
		u.setName(dto.getName());
		u.setEmail(dto.getEmail());
		u.setPass(dto.getPassword());
		u.setRole(mapper.map(dto.getRole(),Role.class));
		
		return mapper.map(repo.save(u), UserDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		User u=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "ID", id));
		repo.delete(u);
	}

	@Override
	public List<UserDto> retrivebyrole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}