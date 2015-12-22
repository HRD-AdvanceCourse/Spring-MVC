package com.spring.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Student {
	
	@Pattern(regexp="[^0-9]*") // add regular expression
	private String studentName;
	
	//Size validation length characters
	//message custom message to display for user
	//@Size(min=2, max=30, message = "please enter value of Hobby between {min} to {max} characters")
	@Size(min=2, max=30) // use messageSource(studentmessage.properties)
	
	@IsValidHobby(listOfValidHobbies="Music|Football|Cricket|Hockey") // relate with IsValidHobby and HobbyValidator
	private String studentHobby;

	@Max(2222) // if more than this value, error will occur, must be less than and equal 
	private long studentMobile;
	
	@Past // Date filed must be the past 
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
