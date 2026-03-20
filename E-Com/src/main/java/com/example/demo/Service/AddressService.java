package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.AddressDto;
import com.example.demo.Model.Address;

public interface AddressService {

	public abstract AddressDto create(AddressDto address);
	public abstract List<AddressDto> list();
	public abstract AddressDto retrive(Long id);
	public abstract AddressDto update(AddressDto dto, Long id);
	public abstract void delete(Long id);
	public abstract List<AddressDto> addressByUser(Long id);
		

	
}