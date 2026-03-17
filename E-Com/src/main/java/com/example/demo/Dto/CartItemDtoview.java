package com.example.demo.Dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CartItemDtoview {

	 Long id;
	 ProductDto product;
	 Integer qty;
	 CartDto cart;
	 LocalDateTime addedAt = LocalDateTime.now();
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public ProductDto getProduct() {
		 return product;
	 }
	 public void setProduct(ProductDto product) {
		 this.product = product;
	 }
	 public Integer getQty() {
		 return qty;
	 }
	 public void setQty(Integer qty) {
		 this.qty = qty;
	 }
	 public CartDto getCart() {
		 return cart;
	 }
	 public void setCart(CartDto cart) {
		 this.cart = cart;
	 }
	 public LocalDateTime getAddedAt() {
		 return addedAt;
	 }
	 public void setAddedAt(LocalDateTime addedAt) {
		 this.addedAt = addedAt;
	 }
	 
}