package com.spring.mvc.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


@Component
public class ArrayListtest {
	
	public void listOperations() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(5);
		al.add(1);
		
		al.add(9);
		al.add(0);
		al.add(10);
		
		ArrayList<Integer> even = (ArrayList<Integer>) al.stream().filter(i -> (i % 2==0 )).map(e -> e+1).collect(Collectors.toList());
		
		ArrayList<Integer> even2 = (ArrayList<Integer>) al.stream().map(e-> e+1).collect(Collectors.toList());
		
		
		System.out.println(even2);
		
//		for(int i= 0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
//		al.forEach(a -> System.out.println(a));
		
//		al.forEach(System.out::println);
		
//		for(Integer i : al) {
//			System.out.println(i);
//		}
		
//		for(Object a:al) {
//			System.out.println(a);
//		}
		
//		Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
////		Collections.shuffle(al);
////		System.out.println(al);
//		
//		//print array elements who's length is > 4
//		
//		
//		ArrayList<String> str = new ArrayList<String>();
//		str.add("hello");
//		str.add("Blue");
//		str.add("whatsup");
//		str.add("tinnava");
//
//
//		
//
//		str.stream().filter(h -> (h.length() > 4)).forEach(System.out::println);
//		
		
		
		
	}

}
