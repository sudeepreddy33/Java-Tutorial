package com.spring.mvc.collections;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.stereotype.Component;

@Component
public class LinkedListTest {
	
	public void linkedListOperations() {
		
		LinkedList ll = new LinkedList();
		
		ll.add("blue");
		ll.add(2);
		ll.add("hello");
		ll.add(true);
		ll.add(null);
		ll.addFirst("bad");
		
		
//		for(Object o : ll) {
//			System.out.println(o);
//		}
		
		ll.forEach(o -> System.out.println(o));
		
			
//		ArrayList al = new ArrayList(ll);
		
		
		
		
	}
	


}
