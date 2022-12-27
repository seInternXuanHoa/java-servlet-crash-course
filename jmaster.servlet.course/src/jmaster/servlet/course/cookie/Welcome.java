package jmaster.servlet.course.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/welcome" })
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 8360763205730026924L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		if (cookies == null) {
			resp.sendRedirect("/jmaster.servlet.course/login-cookie");
		} else {
			resp.setContentType("text/html");
			PrintWriter printWriter = resp.getWriter();
			printWriter.println(req.getCookies().toString());
		}
	}
}
