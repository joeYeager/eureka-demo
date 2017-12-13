package org.joseph.yeager.eurekaclient.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-application", configuration = ClientConfig.class)
public interface Client {
    @GetMapping("/")
    String helloFromPort();
}
