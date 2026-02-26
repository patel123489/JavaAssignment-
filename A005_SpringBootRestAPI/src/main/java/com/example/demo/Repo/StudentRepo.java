package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student1;

public interface StudentRepo extends JpaRepository<Student1, Integer>{

	
}