package jmaster.servlet.course.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/login-cookie" })
public class LoginIST extends HttpServlet {
	private static final long serialVersionUID = 3950297701685416914L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String username = req.getParameter("username");

		if (username.equals("ist")) {
			Cookie cookie = new Cookie("ist", "seInternXuanHoa");
			cookie.setMaxAge(10);
			resp.addCookie(cookie);
			resp.sendRedirect("/jmaster.servlet.course/welcome");
		} else {
			resp.sendRedirect("/jmaster.servlet.course/login-cookie");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<form action='/jmaster.servlet.course/login-cookie' method='post'>");
		printWriter.println("<input type='text' id='username' name='username' value='ist'><br>");
		printWriter.println("<input type='text' id='password' name='password' value='ist'><br><br>");
		printWriter.println("<input type='submit' value='Submit'>");
		printWriter.println("</form>");
	}
}
