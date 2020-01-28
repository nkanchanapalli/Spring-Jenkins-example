package io.javabrains.spring.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsExampleApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsExampleApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("test case started");
		System.out.println("print true");
	}

}
