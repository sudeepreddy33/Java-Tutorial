package com.spring.mvc.collections;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

import org.springframework.stereotype.Component;

@Component
public class DataTypes {
	
	public void dataTypes() {
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		BufferedReader bf = new BufferedReader(is);
//		int i = Integer.parseInt(bf.readLine());
		
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		
		
		
		
		byte b = 4;
		
		short l = 100;
		
		int i = 2000;
		
		long l1 = 189999;
		
		float f = 1.5f;
		
		double d = 56.55;
		
		
//		String a = "";
		
		//here we are trying to convert the i - integer to byte so (byte) casting is performed.
		
		b = (byte) i;
		
		b = (byte) d;
		
		
		
		System.out.println(i);
		System.out.println(b);
	}

}
