package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.RoleDto;
import com.example.demo.Model.Role;

public interface RoleService {
	
		public RoleDto create(RoleDto dto);
		public List<RoleDto> list();
		public RoleDto retrive(Long id);
		public RoleDto update(RoleDto dto, Long id);
		public void delete(Long id);
		
}