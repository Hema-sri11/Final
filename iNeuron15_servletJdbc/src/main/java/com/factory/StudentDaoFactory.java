package com.factory;

import com.dao.IStudentDao;
import com.dao.StudentDaoImpl;

public class StudentDaoFactory {
private StudentDaoFactory() {}
	
	private static IStudentDao studentDao=null;	
	public static IStudentDao getStudentDao() {
		if(studentDao==null) {
			studentDao=new StudentDaoImpl();
		}
		return studentDao;
	}

}
