package com.saitej.core.bootstrap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Value("${project.name}")
	String prop;
	
	public String getProp() {
		return prop;
	}
	

}
