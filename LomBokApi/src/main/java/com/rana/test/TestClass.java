package com.rana.test;

import com.rana.model.Student;

public class TestClass {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.setRollNo(100);
		s.setSidName("Diwakar Rana");
		
		System.out.println(s.getRollNo());
		System.out.println(s.getSidName());
		
	}
}
