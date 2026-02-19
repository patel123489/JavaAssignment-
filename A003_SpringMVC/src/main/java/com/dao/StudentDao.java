package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	public void addOrUpdate(Student student);
	public List<Student> viewStudents();
	public void deleteStudent(int id);
	public Student getStudentById(int id);
}
