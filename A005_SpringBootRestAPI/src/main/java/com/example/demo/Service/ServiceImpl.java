package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.model.Student1;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	@Override
	public Student1 create(Student1 st) {
		return repo.save(st);
	}

	@Override
	public List<Student1> read() {
		List<Student1> students = repo.findAll();
		return students;
	}

	@Override
	public Student1 update(Student1 st, int id) {
		Student1 std = repo.findById(id).orElseThrow();
		std.setName(st.getName());
		std.setEmail(st.getEmail());
		return repo.save(std);
	}

	@Override
	public void destroy(int id) {
		Student1 st = repo.findById(id).orElseThrow();
		repo.delete(st);
	}

	@Override
	public Student1 retrive(int id) {
		Student1 st = repo.findById(id).orElseThrow();
		return st;
	}
	
}