package com.rana.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rana.consumer.RestConsumer;
import com.rana.model.Student;

@WebServlet("/insert")
public class StudentRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = -3104944834387787401L;

	@Override
	public void doPost(HttpServletRequest req, 
										HttpServletResponse res) 
													throws ServletException, IOException {
							int sid = Integer.parseInt(req.getParameter("sid"));
							String stdName = req.getParameter("stdName");
							String stdCourse = req.getParameter("stdCourse");
							Double sfee = Double.parseDouble(req.getParameter("sfee"));
							
							Student s = new Student(sid, stdName, stdCourse, sfee, 0.0 );
							String msg = RestConsumer.saveStudent(s);
							
							req.setAttribute("message", msg);
							RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
							rd.forward(req, res);
	}
}
