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
        return "Hello " + user + "! You currently running on " + config.getEnv() + " environment.";
    }

}
