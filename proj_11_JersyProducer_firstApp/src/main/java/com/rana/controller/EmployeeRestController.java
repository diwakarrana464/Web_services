package com.rana.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;


@Path("/emp")
public class EmployeeRestController {

		@GET
		public String showGet() {
			return "WELCOME TO RESTWEBSERVICES Employee is ready with GET";
		}
		
		@POST
		public String showPost() {
			return "WELCOME TO RESTWEBSERVICES Employee is ready with Post";
		}
		
		@PUT
		public String showPut() {
			return "WELCOME TO RESTWEBSERVICES Employee is ready with PUT";
		}
		
		@DELETE
		public String showDelete(){
			return "WELCOME TO RESTWEBSERVICES Employee is ready with DELETE";
		}
		
	}

