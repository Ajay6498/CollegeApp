package com.java.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.college.entity.LogIn;
import com.java.college.entity.Student;
import com.java.college.repository.Repository;

@Controller
@RequestMapping("/logincontroller")
public class LoginController {

	@Autowired
	private Repository repository;

	@GetMapping("/studlogin")
	public String studLogin(Model model) {
		model.addAttribute("studlogin", new LogIn());
		return "studlogin";
		 
	}

//	@PostMapping("/checklogin")
//	public String login(String studEmail, String studPassword, Model model) {
//		System.out.println(studEmail + "------------");
//		Student user = repository.findByUsernameAndPassword(studEmail, studPassword);
//		System.out.println(user + "+++++++++++++");
//		if (user != null) {
//			// Authentication successful
//			return "studdesktop";
//		} else {
//			// Authentication failed
//			model.addAttribute("msg", "Invalid username or password");
//			return "studlogin";
//		}
//	}

	@PostMapping("/checklogin")
	public String checkLongin(Model model, LogIn logIn) {
		Student student = repository.findByStudEmail(logIn.getStudEmail());
		System.out.println(student + "--------");
		// Student student= repository.findByUsernameAndPassword(logIn.getStudEmail(),
		// logIn.getStudPassword());
		/*
		 * for testing System.out.println(student+"get value form repo.");
		 * System.out.println(logIn);
		 */
		if (student != null) {

			if (logIn.getStudEmail().equals(student.getStudEmail())
					&& logIn.getStudPassword().equals(student.getStudPassword())) {
				String text = "Wellcome " + student.getStudName();
				Student stud = repository.findByStudEmail(logIn.getStudEmail());
				model.addAttribute("msg2", text);
				model.addAttribute("stud", stud);
				return "studdesktop";
			} else {
				model.addAttribute("msg", "Wrong Password");
				return "studlogin";
			}

		} else {
			model.addAttribute("msg", "Enter valid User Name");
			return "studlogin";
		}

//		if (userName.equals(student.getStudEmail()) && Password.equals(student.getStudPassword())) {
//
//			model.addAttribute("msg", "loginSuccess");
//			return "studdesktop";
//		} else {
//			model.addAttribute("msg", "Wrong Credential");
//
//			return "studlogin";
//		}

	}

}
