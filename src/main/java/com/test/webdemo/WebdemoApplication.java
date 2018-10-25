package com.test.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class WebdemoApplication {
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebdemoApplication.class, args);
	}
	@RequestMapping("/hello")
	public String index() {
		System.out.println("Index call");
		return "index";
	}
}
