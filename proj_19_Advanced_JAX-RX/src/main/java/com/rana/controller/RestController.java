package com.rana.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/con")
public class RestController {
	
	@GET
	@Path("/show")
	public String dhowMessage() {
		System.out.println("RestController.dhowMessage()");
		return "Doing right Diwakar Rana";
	}

}
