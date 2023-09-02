package com.java.college.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
 
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
 
@Entity
@Component
public class Student {
	@Id
    
	private Integer studId;
	@NotNull 
	private String studName;
	  
	private String studEmail;
    
	private String studStream;
    
	private String studBatch;
     
	private String studPassword;

	public Student(Integer studId, String studName, String studEmail, String studStream, String studBatch,
			String studPassword) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studEmail = studEmail;
		this.studStream = studStream;
		this.studBatch = studBatch;
		this.studPassword = studPassword;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudStream() {
		return studStream;
	}

	public void setStudStream(String studStream) {
		this.studStream = studStream;
	}

	public String getStudBatch() {
		return studBatch;
	}

	public void setStudBatch(String studBatch) {
		this.studBatch = studBatch;
	}

	public String getStudPassword() {
		return studPassword;
	}

	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studEmail=" + studEmail + ", studStream="
				+ studStream + ", studBatch=" + studBatch + ", studPassword=" + studPassword + "]";
	}

}
