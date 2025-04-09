package com.igr.multithreading;

public class ReduceLOC {

	public static void main(String[] args) {
		
		// First Thread using Normal Object creation but to reduce the code we can create run method in that object.
		Thread t = new Thread () 
		{ 
			public void  run () {
				System.out.println("first thread");
			}
		};
		t.start();
		
	// Second Thread with nameless Object creation	
		
		new Thread () {
			public void  run () {
				System.out.println("Second thread");
			}
		}.start();
		
	// Third Thread with Runnable interface create an object and inside bracket we can call run method then again
	// create the Object of Thread Class and pass the reference of runnable object.	
		Runnable r = new Runnable () {
			public void run () {
				System.out.println("Third Thread");
			}
		};
		
		Thread d = new Thread (r);
		d.start();
		

	}

}
