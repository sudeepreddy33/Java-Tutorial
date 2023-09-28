package com.spring.mvc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class HashSetTest {
	
	public void hashSetOperations() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(1);
		hs.add(3);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(2);
		hs1.add(9);
		hs1.add(3);
//		hs.forEach(a-> System.out.println(a));
		
		//Union
//		hs.addAll(hs1);
		hs.retainAll(hs1);
		System.out.println(hs);

		
	}

}
