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

@WebServlet(urlPatterns = "/edit")
public class EditStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	 int sid = Integer.parseInt(req.getParameter("sid"));
    	 Student s = RestConsumer.getStudentData(sid);
    	 req.setAttribute("std", s);
    	 RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
    	 rd.forward(req, resp);
    }
}
