package com.spring.mvc.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component
public class StringExamples {
	
	StringBuffer sb;
	
	public void stringExamples() {
		
		//reverse a string
		
		String s = "Hello";
		String output = "";
		
		char[] c = s.toCharArray();
		for (int i = s.length() -1 ; i >= 0; i--) {
			System.out.print(c[i]);
		}
		
//		sb = new StringBuffer(s);
		
//		System.out.println(sb.reverse());
		
		//Example to reverse words in a string
		
		String s1 = "Hello my name is Blue";
		
		String st[] = s1.split(" ");//split for every space character 
		Collections.reverse(Arrays.asList(st));
//		System.out.println(String.join(" ", st));// join back
		
//		for(int i= 0; i<s1.length()  ; i++) {
//		char c = s1.charAt(i);
//		System.out.print( " " + c);
			
				
//		}
		
	}

}
