package com.rana.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rana.model.Employee;

public class TestObjectToJsonFile {

	public static void main(String[] args) {
    System.out.println("testing start.....");
    // try with resources + auto Closeable  interface...
    try(Writer w = new FileWriter("d:\\io\\webserTest.json")){
    	Employee e = new Employee();
    	e.setEid(1000);
    	e.setEname("Diwakar Rana");
    	e.setEsal(50000.0f);
    	Gson g = new GsonBuilder()
    			.serializeNulls()
    			.setPrettyPrinting()
    			.create();
    	g.toJson(e, w);
    	System.out.println("tested");
    } catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
	}
