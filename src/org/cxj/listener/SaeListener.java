package org.cxj.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * 
 * @author sae
 * @date 2016-05-26
 *
 * 在sae上使用struts2，需要添加的Listener 
 * 由于sae无法部署tomcat下的应用，powered by Jetty 失去信心，转BAE试试
 */

public class SaeListener implements ServletContextListener,HttpSessionListener,HttpSessionAttributeListener{  
  
    public void contextDestroyed(ServletContextEvent arg0) {}  
  
    public void contextInitialized(ServletContextEvent arg0) {}  
  
    public void sessionCreated(HttpSessionEvent arg0) {}  
  
    public void sessionDestroyed(HttpSessionEvent arg0) {}  
  
    public void attributeAdded(HttpSessionBindingEvent arg0) {}  
  
    public void attributeRemoved(HttpSessionBindingEvent arg0) {}  
  
    public void attributeReplaced(HttpSessionBindingEvent arg0) {}  
  
}  
