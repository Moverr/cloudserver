package com.kodeinc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@Configuration
//@EnableAutoConfiguration
//@EnableDiscoveryClient
//@EnableConfigServer


@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
