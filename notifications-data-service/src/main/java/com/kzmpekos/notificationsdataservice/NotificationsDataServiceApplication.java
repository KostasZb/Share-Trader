package com.kzmpekos.notificationsdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NotificationsDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationsDataServiceApplication.class, args);
	}

}
