package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestServletContextListener
 *
 */
@WebListener
public class TestServletContextListener implements ServletContextListener {


	 public void contextInitialized(ServletContextEvent event)  { 
	    	System.out.println("TestServletContextListener init is called");
	    }
	 
    public void contextDestroyed(ServletContextEvent event)  { 
    	System.out.println("TestServletContextListener destroy is called");
    }
}
