package com.igr.multithreading;

public class MyThread2 extends Thread {

	public void run () {
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
}
}
