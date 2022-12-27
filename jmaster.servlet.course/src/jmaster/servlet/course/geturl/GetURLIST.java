package jmaster.servlet.course.geturl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/url" })
public class GetURLIST extends HttpServlet {
	private static final long serialVersionUID = 4551934650426845510L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Hi " + name);
		printWriter.print("You are " + age + " year olds!");
		printWriter.close();
	}
}
