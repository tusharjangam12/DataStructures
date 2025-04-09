package com.igr.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
	MyThread t = new MyThread (); // user thread starting code
	t.start();  // the method 'start()' will create threads to thread scheduler
	t.interrupt();// whenever we use the Thread.sleep method in run method and using interrupt() method in main class then thread is interrupted. 
	//t.run(); // the method 'run()' available in MyThread class so it will run normally without creating thread
	MyThread t2 = new MyThread ();
	t2.start();
//	for ( int i=0 ; i<10 ;i++) {    // logics of main thread
//	 System.out.println("main thread");
//	}
	 System.out.println(t.getName());  // by using setName()and getName() we can read and change the name of the THread.
	 System.out.println(t2.getName());
	 t2.setName("bunty");
	 System.out.println(t2.getName());
	 
	 System.out.println(Thread.currentThread().getName());
	 Thread.currentThread().setName("IBM"); // we can also change the name of main thread also.
	 System.out.println(Thread.currentThread().getName());
	
	System.out.println(t2.getName()); // for read the id of the thread.
	
	System.out.println(Thread.activeCount()); // how many thread is running
	
	System.out.println(t2.isAlive());
	}

}
