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

@WebServlet(urlPatterns = "/update", loadOnStartup = 1)
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sid = Integer.parseInt(req.getParameter("sid"));
		String stdName = req.getParameter("stdName");
		String stdCourse = req.getParameter("stdCourse");
		Double sfee = Double.parseDouble(req.getParameter("sfee"));
		Student s = new Student(sid, stdName, stdCourse, sfee, 0.0 );
		
		String msg = RestConsumer.updateStudent(s);
		req.setAttribute("resMsg", msg);
		
		//showing updated result.................
		 List<Student> list = RestConsumer.getAllStudents();
		  req.setAttribute("studentList", list);
		  RequestDispatcher rd = req.getRequestDispatcher("allstudents.jsp");
		  rd.forward(req, resp);
	}
}
