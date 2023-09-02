package com.java.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.college.entity.Student;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Integer> {
	
	
	Student findByStudEmail(@Param("studEmail") String studEmail);
	
	@Query("SELECT u FROM Student u WHERE u.studEmail = :studEmail AND u.studPassword = :studPassword")
    Student findByUsernameAndPassword(@Param("studEmail") String studEmail, @Param("studPassword") String studPassword);

 }
//SELECT username, password FROM users WHERE username = 'username_value' AND password = 'password_value';
