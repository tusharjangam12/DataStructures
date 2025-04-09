package com.igr.synch.multithreading;

public class SynchMainThread {

	public static void main(String[] args) {
		new SynchThread1().start();
		new SynchThread2().start();
		new SynchThread3().start();

	}

}
// Synchronized Thread :- use the Keyword Synchronized to method and the out will synchronized (is in Queue). it safe thread
//                         Method.but performance was to slow (Decreases) because it will executes one by one Thread.

// Non-Synchronized Thread :- Normal Thread is Non Synchronized thread, it has no Thread safety but Performance was fast (increases) as
//                             compare to Synchronized Thread.

// Volatile Modifiers :-  if The Variable Declares Volatile every Thread Local copy created, all the modifications done by 
//                         Thread performed local copy instead of Master copy.just before termination of the thread that master 
//                        copy will be updated thread will be terminated