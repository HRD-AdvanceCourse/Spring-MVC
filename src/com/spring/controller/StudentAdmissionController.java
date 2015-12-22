package com.spring.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@InitBinder
	public void InitBinder(WebDataBinder binder){
		//disable studentMobile field
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		
		//register custom date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****mm****dd");
		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat, false));
	
		//customPropertyEditor
		binder.registerCustomEditor(String.class,"studentName", new StudentNameEditor());
	}
	
	// This method will be call first before other method
	@ModelAttribute
	public void addCommonObjects(Model model) {
		model.addAttribute("HeaderAttribute", "This is Header Attribute");
	}

	@RequestMapping(value = "/f", method = RequestMethod.GET)
	// send to this url by GET method
	public ModelAndView getAdmissionFrom() throws Exception {
		String exceptionOccured = "NULL_POINTER";
		if (exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		}
		
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	// get data from form by this url and send by POST
	// --------------Less code and do more things----------------
	public ModelAndView submitAdmissionForm(@Valid
			@ModelAttribute("student") Student student, BindingResult result) {
		// Spring @ModelAttribute will extra request parameter and bind all
		// request parameter with corresponding student object

		if (result.hasErrors()) {
			// this block will return error message to AdmissionForm page
			// we have to add BindingResult result in parameter and (form taglib
			// on the top of AdmissionForm page)

			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		return modelAndView;
	}

	// -----------More code --------------
	// public ModelAndView submitAdmissionForm(
	// @RequestParam(value = "studentName", defaultValue = "abc") String name,
	// @RequestParam(value = "studentHobby", defaultValue = "123") String hobby)
	// {
	//
	// // we can use @RequestParam Map<String, String> reqPar for the parameter
	//
	// Student student = new Student();
	// student.setStudentName(name);
	// student.setStudentHobby(hobby);
	// ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
	// modelAndView.addObject("student", student);
	// return modelAndView;
	// }
	
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception ex){
		System.out.println("Null Pointer Exception "+ex);
		return "NullPointerException";
	}
}
