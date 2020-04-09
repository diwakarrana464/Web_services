package com.rana.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/emp")
public class EmployeeRestController {

		@GET
		public String showMsg() {
			return "WELCOME TO RESTWEBSERVICES Employee is ready";
		}
	}

