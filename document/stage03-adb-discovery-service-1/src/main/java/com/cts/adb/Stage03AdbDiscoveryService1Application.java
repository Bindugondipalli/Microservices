package com.cts.adb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Stage03AdbDiscoveryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Stage03AdbDiscoveryService1Application.class, args);
	}

}
