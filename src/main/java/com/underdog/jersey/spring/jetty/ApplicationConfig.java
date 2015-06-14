/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.jetty;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

/**
 *
 * @author PaulSamsotha
 */
public class ApplicationConfig extends ResourceConfig {
    
    public ApplicationConfig() {
        register(GreetingResource.class);
        register(JacksonFeature.class);
        //register(RequestContextFilter.class);  // Though it might be needed. Guess not
        property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
    }
}
