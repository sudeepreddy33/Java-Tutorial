package com.sudeep.security.designpattern.prototype;

public class PrototypeMainClass {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		//setting the values for first time (it can be database transaction too)
		BookStore bs = new BookStore();
		bs.setId(1);
		bs.setName("Amazon");
		bs.setLocation("NC");
		bs.setNumOfBooks(100);
		
		System.out.println(bs.toString());
		
		
		//cloning the old object which doesn't really require second database transaction and duplicate set methods.
		//Just update/set required changes.
		BookStore bs1 = (BookStore) bs.clone();
		bs1.setId(2);
		System.out.println(bs1.toString());
	}

}
