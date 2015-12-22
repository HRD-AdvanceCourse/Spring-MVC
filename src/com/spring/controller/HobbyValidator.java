package com.spring.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements
		ConstraintValidator<IsValidHobby, String> {

	private String listOfValidHobbies;

	@Override
	public void initialize(IsValidHobby constraintAnnotation) {

		// assign value of parameter to this variable
		this.listOfValidHobbies = constraintAnnotation.listOfValidHobbies();

	}

	@Override
	public boolean isValid(String studentHobby,
			ConstraintValidatorContext context) {
		if (studentHobby == null) {
			return false;
		}

		if (studentHobby.matches(listOfValidHobbies)) {
			return true;
		} else {
			return false;
		}

	}

}
