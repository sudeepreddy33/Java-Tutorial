//package com.sudeep.security.interviewexamples;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import com.sudeep.security.model.Department;
//
//public class CollectionInterview {
//
//	public static void main(String[] args) {
//		
//		//Array of integers
//		int[] i = {3,1,2,4};
//
//		//convert array of integers to ArrayList
//		List<Integer> al = new ArrayList<Integer>();
//		for (int a : i) {
//			al.add(a);
//		}
//		System.out.println(al);
//		
//		//convert ArrayList to LinkedList
//		List<Integer> ll = new LinkedList<Integer>();
//		ll.add(1);
//		ll.add(3);
//		ll.addAll(al);
//		
//		System.out.println(ll);
//		
//		//Convert ArrayList and LinkedList to HashSet and LinkedHashSet(maintains insertion order)
//		
//		Set<Integer> s = new HashSet<Integer>();
//		Set<Integer> s1 = new HashSet<Integer>();
//		s.add(10);
//		s.add(9);
//		s.addAll(ll);
//		System.out.println(s);
//		
//		ArrayList<Integer> araylistfromSet = new ArrayList<Integer>();
//		araylistfromSet.addAll(s);
//		
//		
//	
//		
//		s1 = ll.stream().collect(Collectors.toSet());
//		System.out.println( "s1::::::::" + s1);
//		
//		Set<Integer> s2 = new LinkedHashSet<Integer>();
//		s2.add(9);
//		s2.add(10);
//		s2.addAll(ll);
//		System.out.println(s2);
//		
//		//convert to HashMap
//		
//		Map<Integer, String> hm = new HashMap<Integer, String>();
////		for ( int h : ll) {
////			for (int h2 : s2)
////			hm.put(h, h2);
////		}
////		System.out.println(hm);
//		
//		
//		
//		List<Department> departments = new ArrayList<Department>();
//		departments.add(new Department(2, "service"));
////		departments.add(new Department(1, "se"));
//		departments.add(new Department(1, "se"));
//		departments.add(new Department(3, "ser"));
//		departments.add(new Department(4, "servv"));
//		departments.add(new Department(5, "jdfkjfj"));
//		
//		//traditional way
////		 for (Department d : departments) {
////			 hm.put(d.getId(), d.getName());
////			 
////		 }
////		 System.out.println(hm);
//		 
//		 
//		 //using stream API (make sure you don't have duplicates
//		  hm = departments.stream().collect(Collectors.toMap(e-> e.getId(), e-> e.getName()));
//		  
//		  List<Department> sortedD = departments.stream().sorted((d1, d2) -> (d1.getId()<d2.getId()) ? -1 :1).collect(Collectors.toList());
//		 
//		
//		
//		
//		  System.out.println("sorted::::::" +sortedD);
//		  
//		  //convert HashMap to LinkedHashMap
//		  Map<Integer, String> hm2 = new LinkedHashMap<Integer, String>();
//		  hm2.putAll(hm);
//		  
//		  System.out.println(hm2);
//		
//				
//	}
//}
