package com.spring.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;


public class Student {
	private String studentName;
	
	//Size validation length characters
	//message custom message to display for user
	//@Size(min=2, max=30, message = "please enter value of Hobby between {min} to {max} characters")
	@Size(min=2, max=30) // use messageSource(studentmessage.properties)
	private String studentHobby;

	private long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	//user define type
	private Address studentAddress;

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
}
