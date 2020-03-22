package com.rana.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.rana.model.Employee;

public class TestObjectToJsonFile {

	public static void main(String[] args) {
      try {
    	  Employee em = new Employee();
    	  em.setEid(1000);
    	  em.setEname("Diwakar Singh");
    	  em.setEsal(5000.0f);
    	 // System.out.println(em);
    	  Writer writer = new FileWriter("d:\\io\\webservices1.json");
    	  Gson g = new Gson();
    	  g.toJson(em, writer);
    	  
    	  System.out.println("successful written to file");
	} 
      catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
}
