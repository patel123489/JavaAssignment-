package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String role;
	
	@ManyToMany
	@JoinTable(
			
			name="role_user",
			joinColumns = @JoinColumn(name="rid"),		
			inverseJoinColumns = @JoinColumn(name="uid")
			)
	
	List<User> user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

}