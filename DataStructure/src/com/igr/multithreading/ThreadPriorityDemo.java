package com.igr.multithreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// the default priority of the main thread is 5
		MyThread2 t1 = new MyThread2 ();
		// t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		
		MyThread2 t2 = new MyThread2 ();
		// t2.setPriority(1);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();

	}
// in windows operating system thread priority are not working properly in pirated version if we
//	have license version then it work properly otherwise not. but in Linux OS it works properly. 
}
//     Hook Thread :- Hook thread is executes just before program terminates abnormally.
//     Runtime r = Runtime.getRuntime();
//        r.addShutdownHook(object reference name);
//     Daemon Thread :- the threads which are executing at background those threads are called Daemon threads.
//                      the main thread execution is completed then daemon thread also stop their working .