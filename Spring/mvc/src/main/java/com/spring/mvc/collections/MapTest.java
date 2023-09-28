package com.spring.mvc.collections;

import java.util.HashMap;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;



@Component
public class MapTest {
	
	public void hashMapOperations() {
	
	HashMap<Object,Object> hm = new HashMap<Object,Object>();
	
	hm.put(1, 3);
	hm.put("hi","hello");
	hm.put(true, false);
	hm.put(false, 1);
	
	
	for(Object h :  hm.entrySet()) {
		System.out.println(h);
	}
	
	
	
	}
	
	
	

}
