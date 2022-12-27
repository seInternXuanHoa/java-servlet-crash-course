package jmaster.servlet.course.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/cookie" })
public class CookieIST extends HttpServlet {
	private static final long serialVersionUID = -7459848869295644722L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		Cookie cookie = new Cookie("ist", "seInternXuanHoa");
		resp.addCookie(cookie);
		PrintWriter printWriter = resp.getWriter();
		Arrays.asList(req.getCookies()).forEach(c -> printWriter.println(c));

	}
}
