package com.igr.multithreading;

public class MyThread extends Thread{

	public void run() {
		for (int i = 0 ; i<4 ; i++) {
			System.out.println("userdefined thread");
			try {Thread.sleep(1000);}
			catch (InterruptedException ie)
			{System.out.println("Tread is Interrupted");}
		}
	}
}
