package com.hello.akulaku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AkulakuApplication {

	public static void main(String[] args) {

		SpringApplication.run(AkulakuApplication.class, args);
	}
	@RequestMapping("/")
	public String hellowWorld(){
		return "hello world!";
	}
}
