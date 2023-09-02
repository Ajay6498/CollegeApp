package com.java.college.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.college.entity.Student;
import com.java.college.service.StudServiceImpl;
 

import jakarta.validation.Valid;

@Controller
 @RequestMapping("/studentcontroller")
public class StudentController {

	@Autowired
	private StudServiceImpl serviceImpl;

	// It use to show empty register form of student
	@GetMapping("/register")
	public String registerStudent(Model model) {
		model.addAttribute("register", new Student());
		return "register";
	}

	// It use to save & show status of registration
	@PostMapping("/save")
    public String SaveForm(Model model,@Valid Student student, BindingResult result ) { // use for save product info.
    System.out.println(student);
    if (result.hasErrors()) {
    	return "register";
	}
     
    Boolean status = serviceImpl.add(student);
	if (status == true) {
		model.addAttribute("msg", "Register succesfully");
	} else {
		model.addAttribute("msg", "Fail to Register");
	}
	return "save";
	}

	// It use to get all Students.
	@GetMapping("/getall")
	public String getAll(Model model) {
		List<Student> students = serviceImpl.getAll();
		model.addAttribute("student", students);
		return "show";
	}

	// It use to get student by Id
	@GetMapping("/getbyid")
	public String getById(Model model, Integer studId) {
		Optional<Student> student = serviceImpl.getById(studId);
		model.addAttribute("student", student);
		return "show";
	}

	// It use to update student Info.
	// Note: update & add(save) method are same work coz if record is already present in database then its automatically update also using add.
	@PostMapping("/update")
	public String update(Model model, Student student) {
		serviceImpl.update(student);
		return "update";
	}

	// It use to delete student by Id
	@GetMapping("/delete")
	public String delete(Model model, Integer studId) {
		serviceImpl.delete(studId);

		return "delete";
	}
}
