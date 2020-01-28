package io.javabrains.spring.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsExampleApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsExampleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsExampleApplication.class, args);
		logger.info("leaving main method");
	}

	@PostConstruct
	public void init() { 
		logger.info("Inside init - application started");
	}
}
