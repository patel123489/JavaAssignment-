package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String Username;
	String password;
	
	@ManyToMany
	@JoinTable(
			
			name="role_user",
			joinColumns = @JoinColumn(name="uid"),		
			inverseJoinColumns = @JoinColumn(name="rid")
			)

		List<Role> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}