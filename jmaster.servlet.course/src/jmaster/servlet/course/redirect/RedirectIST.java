package jmaster.servlet.course.redirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/redirect" })
public class RedirectIST extends HttpServlet {
	private static final long serialVersionUID = -8451461009543613155L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * resp.sendRedirect("https://facebook.com");
		 */
		
		resp.setStatus(resp.SC_MOVED_PERMANENTLY);
		resp.setHeader("Location", "https://facebook.com");
	}
}
