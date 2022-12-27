package jmaster.servlet.course.postform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/post" })
public class FormIST extends HttpServlet {
	private static final long serialVersionUID = -2110812482643084676L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<form action='/jmaster.servlet.course/form-post' method='post'>");
		printWriter.println("<label for='name'>Name:</label><br>");
		printWriter.println("<input type='text' id='name' name='name' value='seInternXuanHoa'><br>");
		printWriter.println("<label for='age'>Age:</label><br>");
		printWriter.println("<input type='number' id='age' name='age' value='21'><br><br>");
		printWriter.println("<input type='submit' value='Submit'>");
		printWriter.println("</form>");
	}
}
