package com.spring.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBaseAccessIntercepter extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse respone, Object handler) throws IOException {

		// if this method returns true then - application will further handle
		// the request
		// if this method returns false then - application will not further
		// handle the request

		Calendar calendar = Calendar.getInstance();
		// getting the day on which request is made
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == 1) {
			// 1 means Sunday, 2 means monday... 7 means Satusday
			respone.getWriter().write(
					"The website is closed on Sunday; Please try accessing it on "
							+ "any other week days!!");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse respone, Object handler,
			ModelAndView modelAndView) throws Exception {
		// this method would be called after Spring MVC executes the request
		// method for the request
		System.out
				.println("HandlerInterceptorAdapter: Spring MVC called postHandler method for"
						+ request.getRequestURI().toString());
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse respone, Object handler, Exception ex)
			throws Exception {
		// this method will be called after the response object is produced by
		// the view for the request
		System.out
				.println("HandlerInterceptorAdapter: Spring MVC called afterCompletion method for"
						+ request.getRequestURI().toString());

	}

}
