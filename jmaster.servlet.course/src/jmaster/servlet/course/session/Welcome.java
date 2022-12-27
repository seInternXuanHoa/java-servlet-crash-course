package jmaster.servlet.course.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/welcome-session" })
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = -2423442172092518357L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		String username = (String) httpSession.getAttribute("username");
		if (username == null) {
			resp.sendRedirect("/jmaster.servlet.course/login-session");
		} else {
			resp.setContentType("text/html");
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("Hi! " + username);
		}
	}
}
