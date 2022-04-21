package com.saitej.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.saitej.core.bootstrap.MyBean;


@SpringBootApplication
public class Core01Application  {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Core01Application.class, args);

		
		
	}

}
