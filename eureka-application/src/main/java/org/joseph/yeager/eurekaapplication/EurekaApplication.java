package org.joseph.yeager.eurekaapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaApplication {

	@Value("${server.port}")
	private String SERVER_PORT;

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

	@GetMapping("/")
	public String helloFromPort() {
		return String.format("Hello from service running on port %s", SERVER_PORT);
	}
}
