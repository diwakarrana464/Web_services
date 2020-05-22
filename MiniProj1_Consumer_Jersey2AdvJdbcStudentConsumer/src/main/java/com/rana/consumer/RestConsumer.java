package com.rana.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
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
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		   return resMsg;
	   }
}
