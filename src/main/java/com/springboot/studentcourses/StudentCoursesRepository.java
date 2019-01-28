package com.springboot.studentcourses;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCoursesRepository extends JpaRepository<StudentCourse, Long> {

	List<StudentCourse> findByStudent(String student);
}
