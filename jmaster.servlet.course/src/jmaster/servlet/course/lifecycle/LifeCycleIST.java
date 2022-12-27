package jmaster.servlet.course.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleIST extends HttpServlet {
	private static final long serialVersionUID = -250360851209722599L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<h1>seInternXuanHoa<h1>");
		printWriter.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("Request method: " + arg0.getMethod());
	}

	@Override
	public void destroy() {
		System.out.println("Destroy...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init...");
	}

}
