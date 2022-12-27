package jmaster.servlet.course.servletfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns = { "/filter" }, initParams = { @WebInitParam(name = "count", value = "0") })
public class FilterConfigIST implements Filter {
	private int count;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("Count: " + count++);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		count = Integer.valueOf(arg0.getInitParameter("count"));
	}

}
