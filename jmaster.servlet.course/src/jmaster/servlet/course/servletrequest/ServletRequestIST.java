package jmaster.servlet.course.servletrequest;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet-request" })
public class ServletRequestIST extends HttpServlet {
	private static final long serialVersionUID = 8740512178383742139L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("Request method: " + arg0.getMethod());
		System.out.println("Request server name: " + arg0.getServerName());
		System.out.println("equest servert port: " + arg0.getServerPort());
		Enumeration<String> headerNames = arg0.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			System.out.println(string + " : " + arg0.getHeader(string));
		}
	}

}
