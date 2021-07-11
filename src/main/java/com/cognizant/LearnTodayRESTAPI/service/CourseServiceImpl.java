package com.cognizant.learntodayrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.learntodayrestapi.dao.CourseDao;
import com.cognizant.learntodayrestapi.model.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseDao courseDao;

	@Override
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

	@Override
	public Course getCourseById(int id) {
		return courseDao.getCourseById(id);
	}

	
}
