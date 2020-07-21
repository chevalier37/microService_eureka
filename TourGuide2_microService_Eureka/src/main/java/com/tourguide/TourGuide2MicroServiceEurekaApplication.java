package com.tourguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TourGuide2MicroServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourGuide2MicroServiceEurekaApplication.class, args);
	}

}
