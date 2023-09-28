package com.sudeep.security.designpattern.prototype;

import lombok.Data;

@Data
public class BookStore implements Cloneable {

	private int id;
	private String name;
	private String location;
	private int numOfBooks;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "BookStore [id=" + id + ", name=" + name + ", location=" + location + ", numOfBooks=" + numOfBooks + "]";
	}

	
	
}
