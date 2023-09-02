package com.java.college.entity;

public class LogIn {
 
private String studEmail;
private String studPassword;

public String getStudEmail() {
	return studEmail;
}
public void setStudEmail(String studEmail) {
	this.studEmail = studEmail;
}
public String getStudPassword() {
	return studPassword;
}
public void setStudPassword(String studPassword) {
	this.studPassword = studPassword;
}
@Override
public String toString() {
	return "LogIn [studEmail=" + studEmail + ", studPassword=" + studPassword + "]";
}
public LogIn(String studEmail, String studPassword) {
	super();
	this.studEmail = studEmail;
	this.studPassword = studPassword;
}
public LogIn() {
	super();
	// TODO Auto-generated constructor stub
}


 
}
