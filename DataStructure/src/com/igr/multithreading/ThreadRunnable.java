package com.igr.multithreading;

public class ThreadRunnable {

	public static void main(String[] args) {
		MyRunnable t = new MyRunnable ();
		Thread r = new Thread (t); // because of Runnable is a Interface that have only one method that is RUN().
		r.start();  //but if we have to Register our thread to thread scheduler we must have to call start().
	// so thats why we creating an object of Thread class and giving reference of MyRunnable class that is 't'.and call start(). 	
		for (int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
			
   
	}

}
