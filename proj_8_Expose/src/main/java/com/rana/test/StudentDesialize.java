package com.rana.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rana.model.Student;

public class StudentDesialize {

	public static void main(String[] args) {
	
			String json = "{\r\n" + 
					"  \"sid\": 10000,\r\n" + 
					"  \"sname\": \"Diwakar Singh Rana\",\r\n" + 
					"  \"fee\": 5000.0\r\n" + 
					"}";
			Gson g = new GsonBuilder()
					.excludeFieldsWithoutExposeAnnotation()
					.setPrettyPrinting()
					.create();
			Student s = g.fromJson(json, Student.class);
			System.out.println(s);
	}
}
