package com.in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//outline

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getRequestURI().endsWith("Controller")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			
			request.setAttribute("name", name);
			request.setAttribute("email", email);
			request.setAttribute("pass", pass);
			
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
			
		}
	}

}
