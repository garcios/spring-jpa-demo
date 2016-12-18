package com.oscar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {

	@Bean(name="student")
	@Scope(value="prototype")
	public Student getStudent(){
		return new Student();
	}
	
	@Bean(name="address")
	@Scope(value="prototype")
	public Address getAddress(){
		return new Address();
	}
	
}
