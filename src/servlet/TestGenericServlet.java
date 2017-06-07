package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestGenericServlet extends GenericServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7262286157643605843L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		String value = config.getInitParameter("key");
		System.out.println("TestGenericServlet init called with the value :: " + value);
	}
	
	@Override
	public void service(ServletRequest req,
			ServletResponse res) throws ServletException,
			IOException {
		System.out.println("TestGenericServlet service is called");	
	}
	
	@Override
	public void destroy() {
		System.out.println("TestGenericServlet destroy is called");	
	}
}
