package com.example.restservice;

import org.springframework.beans.factory.annotation.Value;

public class EnvReader {
	
	@Value("${user.env}")
	private String env;
	
	public String getEnv() {
		return env;
	}
}
