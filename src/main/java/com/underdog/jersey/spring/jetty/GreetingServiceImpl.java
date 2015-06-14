/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.jetty;

import org.springframework.stereotype.Component;

/**
 *
 * @author PaulSamsotha
 */
@Component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreeting(String name) {
        return "Hello " + name;
    }   
}
