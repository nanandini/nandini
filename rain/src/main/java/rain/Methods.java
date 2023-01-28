package rain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9, urlPatterns = "/methods")
public class Methods extends HttpServlet {
	public Methods() {
		System.out.println("excute the method  " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method....");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do delete....");
		String data = "displaying data as Delete";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get method....");
		String data = "displaying data as get";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do head method is running....");
		String data = "displaying data ad head";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do options....");
		String data = "Dispaying data as options";
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
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do put method....");
		String data = "displaying data as put";
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

}
