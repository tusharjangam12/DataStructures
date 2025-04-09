package com.igr.practice;


public class MainDoublyCLL {

	public static void main(String[] args) {
		DoublyCircularLL s1 = new DoublyCircularLL ();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.display();
		s1.addLast();
		s1.display();
		s1.addMiddle();
		s1.display();
		s1.deletFirst();
		s1.display();
		s1.deleteLast();
		s1.display();
	}

}
