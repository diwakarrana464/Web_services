package com.rana.test;

import org.codehaus.jackson.map.ObjectMapper;

import com.rana.objects.Employee;

public class ObjectToJSON {

	public static void main(String[] args) {
		
		try {
			//creating the object of model class
			Employee emp = new Employee();
			emp.setEmpid(10);
			emp.setEname("Diwakar Rana");
			emp.setEsal(50000);
			
			//creating object of ObjectMapper class
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(emp);
			System.out.println(json);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("All the Best");
	}
}
