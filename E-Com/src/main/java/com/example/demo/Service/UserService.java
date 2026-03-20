package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.UserDto;

public interface UserService {
	
		public UserDto create(UserDto dto);
		public List<UserDto> list();
		public UserDto update(UserDto dto, Long id);
		public UserDto retrive(Long id);
		public void delete(Long id);
		public List<UserDto> retrivebyrole(Long id );
}