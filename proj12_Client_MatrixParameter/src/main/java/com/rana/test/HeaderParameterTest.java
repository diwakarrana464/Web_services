package com.rana.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class HeaderParameterTest {
	
		static String URI = "http://localhost:2323/proj12_MatrixParameter";
		
		static String PATH = "/rest/headParam;key=222445;name=Diwakar%20Rana";
	          public static void main(String[] args) {
	        	  
	        	 Client c = ClientBuilder.newClient();
		         WebTarget wt =  c.target(URI).path(PATH);
		         Invocation.Builder builder = wt.request();
		         Response resp = builder.get();
		         System.out.println(resp.getStatus()+"   "+resp.getStatusInfo()+" "+resp.readEntity(String.class));
		         
		         

			}
}
