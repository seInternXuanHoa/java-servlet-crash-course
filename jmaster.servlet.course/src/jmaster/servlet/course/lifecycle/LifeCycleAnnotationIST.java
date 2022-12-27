package jmaster.servlet.course.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet" })
public class LifeCycleAnnotationIST extends HttpServlet {
	private static final long serialVersionUID = -2771627863177211356L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<h2>seInternXuanHoa<h2>");
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
	public void init() throws ServletException {
		System.out.println("Init...");
	}

	@Override
	public void destroy() {
		System.out.println("Destroy...");
	}

}
