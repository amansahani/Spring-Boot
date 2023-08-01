package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		String taai = "<img src='./taai.jpg' alt=\"Girl in a jacket\" width=\"500\" height=\"600\">";
		return "<h1 style='display:flex,'>Hello World Baggi</h1> <br> "+ taai;
	}
	@GetMapping("/image")
	public Resource getImage() {
		String pathj = "C:\\Users\\Rahul\\Downloads\\demo\\demo\\src\\main\\java\\com\\example\\demo\\taai.jpg";
		return new ClassPathResource(pathj);
	}

}
