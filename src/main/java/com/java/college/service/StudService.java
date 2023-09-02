package com.java.college.service;

import java.util.List;
import java.util.Optional;

import com.java.college.entity.Student;

public interface StudService {

	public Boolean add(Student student);
	public List<Student> getAll();
	public Optional<Student> getById(Integer studId);
	public void delete(Integer studId);
	public Student update(Student student);
	
	 
	 
 
	
}
