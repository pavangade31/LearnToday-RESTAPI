package com.cognizant.learntodayrestapi.service;

import java.util.List;

import com.cognizant.learntodayrestapi.model.Course;

public interface CourseService {

	public List<Course> getAllCourses();

	public Course getCourseById(int id);

}
