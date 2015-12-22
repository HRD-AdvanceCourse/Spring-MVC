package com.spring.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
// For this annotation will use HobbyValidator.class to validate user input
@Constraint(validatedBy = HobbyValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	// -Parameter of IsValidHobby annotation
	// -if we do not add default IsValidHobby must request listOfValidHobbies
	// parameter
	String listOfValidHobbies() default "Music|Football|Cricket|Hockey";

	String message() default "Please provide a valid Hobby; accepted hobbies are "
			+ "- Music, Footbal, Cricket and Hockey(choose anyone)";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
