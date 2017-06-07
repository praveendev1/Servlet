package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServlet implements Servlet
{
	@Override
	public void init(ServletConfig config) throws ServletException {
		String value = config.getInitParameter("key");
		ServletContext context = config.getServletContext();
		System.out.println("TestServlet init called with the config :: " + value);
		System.out.println("TestServlet init called with the context :: " + context.getInitParameter("context"));
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("TestServlet service is called");
		RequestDispatcher rd = req.getRequestDispatcher("testGenericServlet");
		rd.include(req, res);
		System.out.println("Returned");
	}
	
	@Override
	public void destroy() {
		System.out.println("TestServlet destroy called");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
