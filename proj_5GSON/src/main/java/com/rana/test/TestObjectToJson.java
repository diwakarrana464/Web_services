package com.rana.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rana.model.Employee;

public class TestObjectToJson{

	public static void main(String[] args) {
		try {
			//creat the model class object
			Employee e = new Employee();
			//e.setEid(100);
			e.setEname("Rana");
			//e.setEsal(3.3f);
			
			//create Gson class object first way...
			Gson gg = new Gson();
			String json = gg.toJson(e);
			System.out.println(json);
			
			// second way.......
			String g = new Gson().toJson(e);
			System.out.println(g);
			
			//third way..........
			System.out.println(new Gson().toJson(e));
			
			//create Gson class object fourth way...
			//Gson g1 = new GsonBuilder();
			//String json1 = g1.toJson(e);
			//System.out.println(json1);
			
		} catch (Exception e) {
		      e.printStackTrace();
 		}
	}
}
