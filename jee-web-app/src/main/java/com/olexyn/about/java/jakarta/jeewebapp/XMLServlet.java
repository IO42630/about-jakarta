package com.olexyn.about.java.jakarta.jeewebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XMLServlet extends HttpServlet {

	private static final Logger LOG = LoggerFactory.getLogger(XMLServlet.class);
	@Serial
	private static final long serialVersionUID = 6669666201195825812L;

	private String message;

	public void init() {
		LOG.error("init");
		message = "Hello World! XML";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		LOG.error("get");
		// Hello
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>" + message + "</h1>");
		out.println("</body></html>");
	}

	public void destroy() {
	}
}
