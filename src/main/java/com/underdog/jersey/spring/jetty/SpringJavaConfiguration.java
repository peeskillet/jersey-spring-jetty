/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.jetty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *
 * @author PaulSamsotha
 */
@Component
@Configuration
@ComponentScan(basePackages = {"com.underdog.jersey.spring.jetty"})
public class SpringJavaConfiguration {
    
    /*
    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }*/
}
