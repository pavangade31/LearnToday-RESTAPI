package com.cognizant.learntodayrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.learntodayrestapi.dao.StudentDao;
import com.cognizant.learntodayrestapi.model.Course;
import com.cognizant.learntodayrestapi.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<Course> getAllCourses() {
		return studentDao.getAllCourses();
	}

	@Override
	public boolean postStudent(Student s) {
		return studentDao.postStudent(s);
	}

	@Override
	public boolean deleteStudent(int enrollmentId) {
		return studentDao.deleteStudent(enrollmentId);
	}

}
