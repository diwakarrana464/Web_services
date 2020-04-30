package com.rana.controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/emp")
public class EmployeeRestController {

	@GET
	@Path("/data/{ename}")
	public String show(
			@PathParam("ename")String en
			) 
	{
		return "Welcome to Employee ="+en;
	}
}