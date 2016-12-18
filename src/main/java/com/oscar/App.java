package com.oscar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Student student =  context.getBean("student", Student.class);
		student.setStudenName("This is the name");
		
		System.out.println(student.getAddress().getAddress());
		
		
		((ConfigurableApplicationContext)context).close();
	}

}
