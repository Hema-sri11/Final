package com.dto;

public class FacultyInformation {
	Integer id;
	String name;
	Integer age;
	String post;
	Integer salary;
	public FacultyInformation() {
		this(1,"Rishita",20,"Student",50000);
		System.out.println("Default constructor");
	}
	public FacultyInformation(Integer id, String name, Integer age, String post, Integer salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
		
		System.out.println(id +"\n"+name+"\n"+age+"\n"+post+"\n"+salary);
		
	}
	public FacultyInformation(Integer id) {
		this();
		this.id = id;
	}
	
}
