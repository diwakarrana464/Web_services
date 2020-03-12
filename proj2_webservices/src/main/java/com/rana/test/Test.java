package com.rana.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rana.model.Student;

public class Test {

	public static void main(String[] args) {
		
		Set<String> sub = new HashSet<>();
		sub.add("English");
		sub.add("Hindi");
		sub.add("Math");
		sub.add("Science");
		List<Integer> marks = new ArrayList<>();
		marks.add(80);
		marks.add(70);
		marks.add(70);
		marks.add(60);
		String[] grades = new String[] {"A","B","A","C"};
		try {
			Student std = new Student();
			std.setStdId(100);
			std.setStdName("rana");
			std.setStdFee(5000f);
			std.setSubjects(sub);
			std.setMarks(marks);
			std.setGrades(grades);
			
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(std);
			System.out.println(json);
			System.out.println("successfully complited");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
