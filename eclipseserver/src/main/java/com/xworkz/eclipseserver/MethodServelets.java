package com.xworkz.eclipseserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/tomcat")
public class MethodServelets extends HttpServlet {

	public MethodServelets() {
		System.out.println("calling default constructor of MethodServelets");
	}
	
	@Override
	public void init() throws ServletException {
	System.out.println("running init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method");
		String data = "displaying data as get";
		PrintWriter writer = resp.getWriter();
		writer.print(data);

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do put method....");
		String data = "displaying data as put";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post method....");
		String data = "displaying data as post";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do trace method ....");
		String data = "displaying data as trace";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do delete....");
		String data = "displaying data as Delete";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}
}