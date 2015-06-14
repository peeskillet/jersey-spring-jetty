/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.jetty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PaulSamsotha
 */
@Path("greeting")
public class GreetingResource {
    
    @Autowired
    private GreetingService service;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Message getGreeting(@QueryParam("name") String name) {
        Message message = new Message();
        message.message = service.getGreeting(name);
        return message;
    }
}
