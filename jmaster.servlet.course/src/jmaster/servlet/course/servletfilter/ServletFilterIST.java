package jmaster.servlet.course.servletfilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/filter" })
public class ServletFilterIST extends HttpServlet {
	private static final long serialVersionUID = 6902553455814524400L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("seInternXuanHoa");
		printWriter.close();
	}
}
