package com.oscar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {

	private String studenName;
	
	@Autowired
    private Address address;
	
	
	public Student(){
		
	}
	
	public String getStudenName() {
		return studenName;
	}


	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
