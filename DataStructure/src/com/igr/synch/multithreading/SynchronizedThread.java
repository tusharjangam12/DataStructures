package com.igr.synch.multithreading;

public class SynchronizedThread {
synchronized static void msg (String str) {
	for (int i = 0; i<4; i++) {
		System.out.println("Hi"+str);
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}
