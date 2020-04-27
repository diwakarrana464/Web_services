package com.rana.controller;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/headParam")
public class HeaderParamController {
	
	
	
	Response resp ;
	@GET
	public Response show(
			@MatrixParam("key")String val,
			@MatrixParam("name")String name
			) {
		
		String msg =  "your data is "+ val +" "+name;
		resp = Response
				.status(400)
				.entity(msg)
				.build();
		return resp;
	}
}
