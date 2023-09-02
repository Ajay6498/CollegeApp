package com.java.college.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.college.entity.Student;
import com.java.college.repository.Repository;

@Service
public class StudServiceImpl implements StudService {

	@Autowired
	private Repository repository;

	@Override
	public Boolean add(Student student) {
		Student add = repository.save(student);
		if (add.getStudId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Student> getAll() {
		List<Student> students = repository.findAll();
		return students;
	}

	@Override
	public Optional<Student> getById(Integer studId) {
		return repository.findById(studId);
	}

	@Override
	public void delete(Integer studId) {
		
		  repository.deleteById(studId);
	}
	
	// This method is not mandatory --> if we try to add duplicate it auto update coz Id is a primary.
	@Override
	public Student update(Student student) {
		 
		return repository.save(student);
	}

	 

}
