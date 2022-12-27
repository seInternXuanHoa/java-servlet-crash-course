package jmaster.servlet.course.postform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/form-post" })
public class PostFormIST extends HttpServlet {
	private static final long serialVersionUID = 3130883862188252653L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("GET");
		printWriter.print("Name: " + name);
		printWriter.print("Age: " + age);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("POST");
		printWriter.print("Name: " + name);
		printWriter.print("Age: " + age);
	}
}
