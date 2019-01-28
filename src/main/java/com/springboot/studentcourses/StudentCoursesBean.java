package com.springboot.studentcourses;

import java.util.List;

public class StudentCoursesBean {

	private String studentConsulted;
	private int port;
	private List<StudentCourse> studentCourses;

	public StudentCoursesBean() {
		super();
	}

	public StudentCoursesBean(String studentConsulted, int port, List<StudentCourse> studentCourses) {
		super();
		this.studentConsulted = studentConsulted;
		this.port = port;
		this.studentCourses = studentCourses;
	}

	public String getStudentConsulted() {
		return studentConsulted;
	}

	public int getPort() {
		return port;
	}

	public List<StudentCourse> getCourseStudents() {
		return studentCourses;
	}

	public void setStudentConsulted(String studentConsulted) {
		this.studentConsulted = studentConsulted;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setCourseStudents(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}
}
