package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestServletRequestListener
 *
 */
@WebListener
public class TestServletRequestListener implements ServletRequestListener {

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent event)  { 
    	System.out.println("TestServletRequestListener init is called");
    }
    
	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent event)  { 
    	System.out.println("TestServletRequestListener destroy is called");
    }
}
