package com.example.demo.Dto;

import java.time.LocalDateTime;
import java.util.List;

public class CartDto {

	Long id;
	UserDto user;
	List<CartItemDtoview> items;
	LocalDateTime createdAt = LocalDateTime.now();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public List<CartItemDtoview> getItems() {
		return items;
	}
	public void setItems(List<CartItemDtoview> items) {
		this.items = items;
	}
	
}