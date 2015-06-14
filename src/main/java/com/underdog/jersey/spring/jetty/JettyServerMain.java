/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *
 * @author PaulSamsotha
 */
public class JettyServerMain {

    public static void main(String[] args) throws Exception {
        ApplicationConfig applicationConfig = new ApplicationConfig();

        ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(applicationConfig));

        ServletContextHandler context = new ServletContextHandler();

        context.setContextPath("/");
        context.addServlet(jerseyServlet, "/rest/*");
        

        context.addEventListener(new ContextLoaderListener());
        context.addEventListener(new RequestContextListener());

        context.setInitParameter("contextClass", AnnotationConfigWebApplicationContext.class.getName());
        context.setInitParameter("contextConfigLocation", SpringJavaConfiguration.class.getName());

        Server server = new Server(8080);
        server.setHandler(context);

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
