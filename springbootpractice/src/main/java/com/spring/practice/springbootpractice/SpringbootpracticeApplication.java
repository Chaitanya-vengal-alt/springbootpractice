package com.spring.practice.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootpracticeApplication {
  @GetMapping("/home")
  public String message(){
	  return "welcome to springbootapplication";
  }
  @GetMapping("/welcome")
  public String othermessage() {
	  return "welcome to home page";
  }
	public static void main(String[] args) {
		SpringApplication.run(SpringbootpracticeApplication.class, args);
	}

}
