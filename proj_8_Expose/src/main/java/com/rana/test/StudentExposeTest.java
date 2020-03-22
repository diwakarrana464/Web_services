package com.rana.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rana.model.Student;

public class StudentExposeTest {

	public static void main(String[] args) {

		Student s = new Student();
		s.setFee(5000f);
		s.setSid(10000);
		s.setSname("Diwakar Singh Rana");
		
		Gson g = new GsonBuilder()
				.setPrettyPrinting()
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		String json = g.toJson(s);
		System.out.println(json);	}

}
