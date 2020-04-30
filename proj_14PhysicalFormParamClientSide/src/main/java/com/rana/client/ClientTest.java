package com.rana.client;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

public class ClientTest {
	
	public static void main(String[] args) {
		
		String uri = "http://localhost:2323/proj_14LogicalForm_param";
		String path= "/rest/logicalform/param";
		
		try {
			
			Form   f=   new Form();
			f.param("cardNum", "12345");
			f.param("cardName", " Bank of Baroda");
			f.param("expYear", "2025");
			f.param("cvv", "444");
			f.param("amt", "5000");
			f.param("expMonth" , "July");
			
			//creating client object
			Client c = ClientBuilder.newClient();
			WebTarget wt = c.target(uri).path(path);
			Invocation.Builder builder = wt.request();
			Response resp = builder.post(Entity.form(f));
			
			System.out.println(resp.getStatus()+ "    "+ resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}//end of class

}
