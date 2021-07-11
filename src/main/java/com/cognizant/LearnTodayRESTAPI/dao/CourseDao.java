package com.cognizant.learntodayrestapi.dao;

import java.util.List;

import com.cognizant.learntodayrestapi.model.Course;

public interface CourseDao {

	public List<Course> getAllCourses();
	
	public Course getCourseById(int id);
	
}
