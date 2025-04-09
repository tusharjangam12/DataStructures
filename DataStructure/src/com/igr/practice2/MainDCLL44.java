package com.igr.practice2;

public class MainDCLL44 {
	
	public static void main (String [] args ) {
	DoublyCircularLL44 s = new DoublyCircularLL44 ();
	s.addFirst();
	s.addFirst();
	s.addFirst();
	s.addFirst();
	s.display();
	System.out.println("------------------------");
	s.addLast();
	s.display();
	System.out.println("------------------------");
	s.addMiddle();
	s.display();
	System.out.println("------------------------");
	s.deleteFirst();
	s.display();
	System.out.println("------------------------");
	s.deleteLast();
	s.display();
	System.out.println("------------------------");
	s.deleteMiddle();
	s.display();
	
	}
}
