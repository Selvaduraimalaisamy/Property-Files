package com.Proper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages="com.Proper")

public class FilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilesApplication.class, args);
	}

}
