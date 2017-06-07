package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestHttpServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6277917847579232157L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getNamedDispatcher("TestServlet");
		rd.forward(req, resp);
		System.out.println("TestHttpServlet is called");
	}
}
