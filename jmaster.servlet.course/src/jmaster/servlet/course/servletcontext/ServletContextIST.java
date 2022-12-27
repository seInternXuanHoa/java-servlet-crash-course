package jmaster.servlet.course.servletcontext;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/serlvet-context-re" })
public class ServletContextIST extends HttpServlet {
	private static final long serialVersionUID = -5611413674475083211L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().setAttribute("author", "seInternXuanHoa");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("/jmaster.servlet.course/servlet-context");
	}
}
