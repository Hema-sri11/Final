package com.service;

import com.dao.IStudentDao;
import com.factory.StudentDaoFactory;
import com.model.Student;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao=StudentDaoFactory.getStudentDao();
	@Override
	public String addData(Student student) {
		
		return dao.addData(student);
	}

}

