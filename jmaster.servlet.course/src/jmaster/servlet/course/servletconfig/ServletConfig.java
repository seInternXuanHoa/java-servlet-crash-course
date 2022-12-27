package jmaster.servlet.course.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet-config" }, initParams = {
		@WebInitParam(name = "name", value = "seIntenXuanHoa") })
public class ServletConfig extends HttpServlet {
	private static final long serialVersionUID = 4559022198281583063L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = super.getServletConfig().getInitParameter("name");
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("H! Mr, " + name);
		printWriter.close();
	}

}
