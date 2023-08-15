package com.example.clouddiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDiscoveryServerApplication.class, args);
	}

}
