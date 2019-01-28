package com.springboot.studentcourses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student_course")
public class StudentCourse {

	@Id
	private Long id;

	@Column(name = "course_name")
	private String name;

	@Column(name = "student_name")
	private String student;

	@Column(name = "score")
	private float score;

	public StudentCourse() {
		super();
	}

	public StudentCourse(Long id, String name, String student, float score) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStudent() {
		return student;
	}

	public float getScore() {
		return score;
	}
}
