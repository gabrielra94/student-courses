package com.springboot.studentcourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class StudentCoursesController {

	@Autowired
	private Environment environment;

	@Autowired
	private StudentCoursesRepository courseStudentRepository;

	@GetMapping("/student-courses/name/{name}")
	public StudentCoursesBean studentCourses(@PathVariable String name) {

		List<StudentCourse> studentCourses = courseStudentRepository.findByStudent(name);

		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		StudentCoursesBean studentCoursesBean = new StudentCoursesBean(name, port, studentCourses);

		return studentCoursesBean;
	}
}
