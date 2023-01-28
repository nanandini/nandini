package com.xworkz.song;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/lyrics")
public class SongServalet extends HttpServlet {
	public SongServalet() {
		System.out.println("running defual constructorv of song....");

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("created and started init...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created and started doget in song");
		String name = req.getParameter("songName");
		String singer = req.getParameter("singer");
		String movie = req.getParameter("movie");
		String hero = req.getParameter("hero");
		String heroine = req.getParameter("heroine");
		
		System.out.println(name);
		System.out.println(singer);
		System.out.println(movie);
		System.out.println(hero);
        System.out.println(heroine);
        
        PrintWriter write = resp.getWriter();
        write.print("<html>");
        write.print("<body>");
        write.print("<h1>"); 
        write.
	}
}
