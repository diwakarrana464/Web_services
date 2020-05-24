package com.rana.consumer;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.rana.model.Student;

public class RestConsumer {
	private static final String URL= "http://localhost:2323/MiniProj_1_JAX-RX-JDBC-Integration";
	   public static String saveStudent(Student s){
		   String path = "/rest/sun/save";
		   String resMsg = null; 
		   try {
			         Client c = ClientBuilder.newClient();
			         WebTarget wt =  c.target(URL).path(path);
			         Invocation.Builder builder =  wt.request();
			         Response res = builder.post(Entity.json(s));
			         
			         int status = res.getStatus();
			         System.out.println(status);
			         resMsg = res.readEntity(String.class);
			         System.out.println(resMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		   return resMsg;
	   }// end of save method...
	   //..........................................................method for all student details......................................
	public static  List<Student>  getAllStudents(){
		   String path = "/rest/sun/getStudents";
		   List<Student> list = null;
		try {
			Client c = ClientBuilder.newClient();
			WebTarget wt = c.target(URL).path(path);
			Invocation.Builder builder = wt.request();
			Response res = builder.get();
			
			//JSON [{},{},{}] => List<Student>
			list = res.readEntity(new GenericType<List<Student>>(){});
		} catch (Exception e) {
			e.printStackTrace();
		}
		   return list;
	   }// end of method........
	
	public static String deleteStudent(Integer sid ) {
		String path = "/rest/sun/"+sid;
		String msg = null;
	//.................................method for delete.......................................
		try {
			Client c = ClientBuilder.newClient();
			WebTarget wt = c.target(URL).path(path);
			Invocation.Builder builder = wt.request();
			Response res = builder.delete();
			
			msg = res.readEntity(String.class);
			System.out.println(msg + " from restConsumer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}//end of method......................getting data for edit ........................
	
	public static Student getStudentData(int sid) {
		String path = "/rest/sun/"+sid;
		Student std = null;
		try {
			Client c = ClientBuilder.newClient();
			WebTarget wt = c.target(URL).path(path);
			Invocation.Builder builder = wt.request();
			Response res = builder.get();
			
			std = res.readEntity(Student.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}
	//...................................................Updating student data......................................
	
	public static String updateStudent(Student s) {
		String path = "/rest/sun/update";
		String resMsg = null;
		try {
			Client c = ClientBuilder.newClient();
			WebTarget wt = c.target(URL).path(path);
			Invocation.Builder builder = wt.request();
			Response res = builder.put(Entity.json(s));
			resMsg = res.readEntity(String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resMsg;
	}
}
