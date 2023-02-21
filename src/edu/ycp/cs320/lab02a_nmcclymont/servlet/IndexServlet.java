package edu.ycp.cs320.lab02a_nmcclymont.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doGet");
		
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doPost");
		
		// Determine which button was selected by the user and call for its
		// respective jsp
		if (req.getParameter("addNumbers") != null) {
			req.getRequestDispatcher("/_view/addNumbers.jsp").forward(req, resp);
		} else if (req.getParameter("multiplyNumbers") != null) {
			req.getRequestDispatcher("/_view/multiplyNumbers.jsp").forward(req, resp);
		} else if (req.getParameter("guessingGame") != null) {
			req.getRequestDispatcher("/_view/guessingGame.jsp").forward(req, resp);
		} else {
			throw new ServletException("Unknown command");
		}
	}
}
