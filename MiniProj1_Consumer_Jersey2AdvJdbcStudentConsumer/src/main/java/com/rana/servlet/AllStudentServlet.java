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


@WebServlet("/allStudents")
public class AllStudentServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> list = RestConsumer.getAllStudents();
		req.setAttribute("studentList", list);
		RequestDispatcher rd = req.getRequestDispatcher("allstudents.jsp");
		rd.forward(req, resp);
	}
}

