//package com.sudeep.security.interviewexamples;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//import com.sudeep.security.model.Department;
//
//public class StringInterviewQuestions {
//	
//	public static void main(String[] args) {
//		
//		//reverse a string
//		String s = "Sudeep";
//		String s1 = "Sudeep Reddy";
//		System.out.println(s == s1);
//		s.substring(2);
//		String[] a = s1.split(" ");
//		
//		String rev = "";
//		
////		for (int i = s.length()-1; i>=0; i--) {
////			rev = rev + s.charAt(i);
////		}
//		System.out.println(rev);
//		
//		String[] words = s1.split(" ");
//		
//		for (int i = a.length-1; i>=0; i--) {
//			rev = rev + a[i] + " ";
//		}
////		System.out.println(s1.substring(7,12) + s1.substring(0, 7));
//		System.out.println(rev);
//		
//		
//		//Check max number of character in a string
//		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//		
//		char c = 0;
//		
//		int p = 0;
//		
//		for (int i = 0; i< s1.length(); i++) { //iterating over the string 
//			char c1 = s1.charAt(i); //getting each character and storing in c1
//			hm.put(c1, hm.getOrDefault(c1, 0) + 1); //creating a map with each character as key and value as 0 at first and increasing if already present
//			if(p < hm.get(c1)) {
//				c = c1;
//				p = hm.get(c1);
//			}
//			}
//		System.out.println(c);
//		
//		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
//		hm2.put(1, "Sudeep");
//		hm2.put(2, "Hi");
//		System.out.println(hm2.get(2));
//		
//
//		
//		
//		
//
////		
//		
//	}
//
//}
