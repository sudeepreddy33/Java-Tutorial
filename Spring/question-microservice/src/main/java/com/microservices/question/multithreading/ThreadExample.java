package com.microservices.question.multithreading;

public class ThreadExample extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample te = new ThreadExample();
		te.start();
		te.sleep(10);
		te.getName();
		
		ThreadExample te1 = new ThreadExample();
		te1.start();
		
		
	}

	public void run() {
		
		int counter = 0; 

		for (int i = 0; i < 10; i++) {
			counter++;
			System.out.println("in run method" + counter);
		}
			
	}

}
