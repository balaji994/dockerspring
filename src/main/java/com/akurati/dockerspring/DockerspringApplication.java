package com.akurati.dockerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerspringApplication {
	@RequestMapping("")
    public String home(){
	    return "Working from Docker";
    }

	public static void main(String[] args) {
		SpringApplication.run(DockerspringApplication.class, args);
	}
}
