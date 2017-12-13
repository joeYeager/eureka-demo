package org.joseph.yeager.eurekaclient;

import org.joseph.yeager.eurekaclient.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients(clients = {
		Client.class,
})
@RestController
public class EurekaClientApplication {

	@Autowired
	Client client;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@GetMapping("/")
	public String callEurekaApplication() {
		return client.helloFromPort();
	}
}
