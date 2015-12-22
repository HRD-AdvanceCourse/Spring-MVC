package com.spring.controller;

import java.beans.PropertyEditorSupport;


public class StudentNameEditor extends PropertyEditorSupport {

	// when you will submit the admission form -->
	// Spring MVC will run setAsTest function of this class -->
	// before performing data binding task for studentName property of student
	// object

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException{
		if (studentName.contains("Mr.") || studentName.contains("Ms.")) {
			setValue(studentName);
		} else {
			studentName = "Ms." + studentName;
			setAsText(studentName);
		}
	}
}
