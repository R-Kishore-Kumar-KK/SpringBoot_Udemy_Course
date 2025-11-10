package com.kk.springbootudemy.learn_spring_boot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.springbootudemy.learn_spring_boot.beans.Course;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Spring Boot", "Kishore"), new Course(2, "Spring MVC", "Kishore"),
				new Course(3, "Data Structure", "Kishore"));
		
		
	}
}
