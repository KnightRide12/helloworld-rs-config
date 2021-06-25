package com.example.restservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "user")
public class EnvReader {
	
	private String env;
	
	public String getEnv() {
		return env;
	}
	
	public void setEnv(String env) {
		this.env = env;
	}
}
