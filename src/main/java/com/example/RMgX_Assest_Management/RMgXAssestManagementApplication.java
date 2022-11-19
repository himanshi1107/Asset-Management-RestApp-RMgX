package com.example.RMgX_Assest_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class RMgXAssestManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RMgXAssestManagementApplication.class, args);
		System.out.println("Project Running to Start ");
	}

}
