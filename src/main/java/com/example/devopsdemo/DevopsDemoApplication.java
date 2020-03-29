package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@Controller
public class DevopsDemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	  
}
