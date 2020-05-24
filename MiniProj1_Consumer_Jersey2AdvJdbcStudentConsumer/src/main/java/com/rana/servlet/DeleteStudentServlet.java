package com.rana.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rana.consumer.RestConsumer;
import com.rana.model.Student;

@WebServlet(urlPatterns = "/delete", loadOnStartup = 1)
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  int id = Integer.parseInt(req.getParameter("sid"));
		  String msg = RestConsumer.deleteStudent(id);
		  System.out.println(msg + " from servlet");
		  req.setAttribute("resMsg", msg);
		  
		  //get All student again and display........
		  List<Student> list = RestConsumer.getAllStudents();
		  req.setAttribute("studentList", list);
		  RequestDispatcher rd = req.getRequestDispatcher("allstudents.jsp");
		  rd.forward(req, resp);
		  
	}
}
