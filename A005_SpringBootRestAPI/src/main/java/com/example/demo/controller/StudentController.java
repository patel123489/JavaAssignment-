package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.Service.StudentService;
import com.example.demo.model.Student1;

@RestController
public class StudentController {

private final StudentRepo studentRepo;
	
	@Autowired
	StudentService service;

    StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
	
	@PostMapping("/students")
	public ResponseEntity<Student1> create(@RequestBody Student1 st) {
		Student1 createStudent = service.create(st);
		return new ResponseEntity<>(createStudent, HttpStatus.CREATED);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student1>> read() {
		List<Student1> students = service.read();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student1> update(@RequestBody Student1 st, @PathVariable("id") int id) {
		Student1 std = service.update(st, id);
		return new ResponseEntity<>(std, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id) {
		service.destroy(id);
		return ResponseEntity.ok("student deleted");
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student1> get(@PathVariable("id") int id) {
		Student1 st = service.retrive(id);
		return new ResponseEntity<>(st, HttpStatus.OK);
	}
	
}