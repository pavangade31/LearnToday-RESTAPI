package com.cognizant.learntodayrestapi.dao;

import java.util.List;

import com.cognizant.learntodayrestapi.model.Course;
import com.cognizant.learntodayrestapi.model.Student;

public interface StudentDao {

	public List<Course> getAllCourses();
	
	public boolean postStudent(Student s);
	
	public boolean deleteStudent(int enrollmentId);
	
}
