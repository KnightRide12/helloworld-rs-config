package com.redhat.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KubernetesLiveConfigExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesLiveConfigExampleApplication.class, args);
	}

}
