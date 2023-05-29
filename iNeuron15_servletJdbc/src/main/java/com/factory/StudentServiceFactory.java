package com.factory;

import com.service.IStudentService;
import com.service.StudentServiceImpl;

public class StudentServiceFactory {
	private StudentServiceFactory() {
	}

	private static IStudentService studentService = null;

	public static IStudentService getStudentService() {
		if (studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}

}
