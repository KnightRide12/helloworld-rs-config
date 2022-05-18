package com.redhat.dev.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.dev.config.Config;

@RestController
public class LiveConfigRestController {

    private static Logger log = LoggerFactory.getLogger(LiveConfigRestController.class);

    private Config config;

    public LiveConfigRestController(Config config) {
        this.config = config;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/greet/{user}")
    public String getPropertyValue(@PathVariable("user") String user) {
        log.info("user.env:" + config.getEnv());
        StringBuilder str = new StringBuilder();
        str.append("Hello " + user + "! You currently running on " + config.getEnv() + " environment.");
        str.append("\n");
        switch (config.getEnv().toLowerCase()) {
            case "dev":
            	str.append("Have fun and go break things!");
            	break;
            case "prod":
            	str.append("Be careful, you are not allowed to break things!");
            	break;
        	default:
        		str.append("I don't know if you should be breaking things.");
        		break;
        		
        }
        
        return str.toString();
    }

}
