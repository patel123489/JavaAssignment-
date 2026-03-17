package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.RoleDto;
import com.example.demo.Model.Role;
import com.example.demo.payload.ResourceNotFoundException;
import com.example.demo.Repo.RoleRepo;
import com.example.demo.Service.RoleService;

@Service
public class RoleServiceImpl  implements RoleService{

	@Autowired
	RoleRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public RoleDto create(RoleDto dto) {
			
		Role role = mapper.map(dto, Role.class);
		Role created = repo.save(role);
		return mapper.map(created, RoleDto.class);
	}

	@Override
	public List<RoleDto> list() {
		
		List<Role> roles = repo.findAll();
		List<RoleDto> dtos = 
				roles.stream().map(role->{
					return mapper.map(role, RoleDto.class);
				}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public RoleDto retrive(Long id) {
		
		Role role = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Role", "ID", id));
		
		
		return mapper.map(role, RoleDto.class);
	}

	@Override
	public RoleDto update(RoleDto dto, Long id) {
		Role role = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Role", "ID", id));
		role.setName(dto.getName());
		role.setCreatedAt(dto.getCreatedAt());
		return mapper.map( repo.save(role), RoleDto.class);
	}

	@Override
	public void delete(Long id) {
		Role role = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Role", "ID", id));
		repo.delete(role);
		
	}

}