package com.java.gitOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitopsApplication {
	
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Java With GitOps !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitopsApplication.class, args);
	}

}
