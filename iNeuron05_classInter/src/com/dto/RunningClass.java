package com.dto;

import com.dao.IStudent;
import com.dao.StudentImpl;
import com.dao.abs.Faculty;

public class RunningClass {

	public static void main(String[] args) {

		Faculty f = new Faculty();
		f.show();
		f.add();
		int num = f.calculateSalary();
		System.out.println(num + "\n");

		IStudent is = new StudentImpl();
		is.walk();
		is.eat();
		is.run();
		is.study();

	}

}
