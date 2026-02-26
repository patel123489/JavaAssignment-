package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Student1;

public interface StudentService  {

	public Student1 create(Student1 st);
	public List<Student1> read();
	public void destroy (int id);
	public Student1 retrive(int id);
	public Student1 update(Student1 st, int id);
	
}