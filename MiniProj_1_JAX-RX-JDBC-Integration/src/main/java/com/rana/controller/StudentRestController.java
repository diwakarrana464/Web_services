package com.rana.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.rana.service.IStudentService;
import com.rana.student.Student;

@Path("/sun")
public class StudentRestController {
	
	@Inject
	IStudentService service;
	
	
	//testing msg.....................................
	@GET
	@Path("/show")
	public String showMsg() {
		return "Working fine";
	}
	
	// saving student data to database...............
	@POST
	@Path("/save")
	@Consumes("application/json")
	//@Produces("text/plain")
	public Response saveStudent(Student std) {
		Response res = null;
		try {
			Integer count = service.saveStudent(std);
			if(count > 0) {
				res = Response.status(Status.CREATED)
						.entity("Student Saved")
						.build();
			}
			else {
				res = Response.status(Status.BAD_REQUEST)   // wrong inputs.....
						.entity("Student not Saved")
						.build();
			}
			
		} catch (Exception e) {
			res = Response.status(Status.INTERNAL_SERVER_ERROR)// 500 exception
					.entity("Student not Saved")
					.build();
			e.printStackTrace();
		}
		return res;
	}
//.........................................................fetching all student data..................................................
	
	@GET
	@Path("getStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public Response	getAllStudents(){
		Response res = null;
		try {
			List<Student> list = service.getAllStudents();
			res = Response.status(Status.OK)
					.entity(list)
					.build();
			
		} catch (Exception e) {
			res = Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity("Unable to fetch data.............")
					.build();
			e.printStackTrace();
		}
		return res;
	}
//..............removing one student from database..........................
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response removeOneStudent(
			 @PathParam("id") Integer id) {
		System.out.println("service class"+id);
		Response res = null;
		try {
			boolean isDeleted = service.removeOneStudent(id);
			if(isDeleted)
			{
				 res = Response.status(Status.OK)
						  .entity("data deleted successfully")
						  .build();	
			} else {
				 res = Response.status(Status.BAD_REQUEST)
						  .entity("data not exist()...")
						  .build();
			}
			
		} catch (Exception e) {
			 res = Response.status(Status.INTERNAL_SERVER_ERROR)
					  .entity(" server side problem is there, please try again later...")
					  .build();
			e.printStackTrace();
		}
		return res;
	 }
	//.............................................getting data of one student.........
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	 public Response getOneStudent(
			 @PathParam("id") Integer sid) {
		 Response res=null ;
		 Student std = null;
		 		try {
		 			std = service.getOneStudent(sid);
		 			if(std!=null) {
		 				res = Response.status(Status.OK)
								.entity(std)
								.build();
		 			}else {
		 				res = Response.status(Status.NO_CONTENT)
								.build();
		 			}
					
				} catch (Exception e) {
					res = Response.status(Status.INTERNAL_SERVER_ERROR)
							.entity("Unable to fetch student data")
							.build();
					e.printStackTrace();
				}
		 return res;
	 }
	//...................................updating one student data............................................ 
	//because for one put only one method is there so no need to provide path
	//produces also optional......in case text/plain..
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	//@Path("/update")
	//@Produces(MediaType.TEXT_PLAIN)
	public Response updateStudent(Student s) {
		 Response res =null;
		 try {
			boolean isUpdated =  service.updateStudent(s);
			if(isUpdated) {
							res = Response.status(Status.OK)
									.entity("Student Details updated successfully")
									.build();
			}else {
				res = Response.status(Status.NOT_FOUND)
						.entity(" student"  +s.getStdId()+" not found")
						.build();
			}
			
		} catch (Exception e) {
			res = Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity("Unable to update data!!")
					.build();
			e.printStackTrace();
		}
		 return res;
	 }
}	// end of controller class................
	
	

