package com.rana.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.rana.model.Employee;

public class Test {

	public static void main(String[] args) {
      try {
		Reader reader = new FileReader("d://io//webservices.json");
		Gson g = new Gson();
		Employee e =  g.fromJson(reader, Employee.class);
		System.out.println(e);
		
		//................................................................................
		String  json  = "{\"ename\":\"Diwakar Rana\",\"esal\":3000.0}";
		Employee emp = g.fromJson(json, Employee.class);
		System.out.println(emp);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}
}
