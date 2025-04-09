package com.igr.datastructure.circularlinkedlist;

public class MainCLL {
	public static void main (String[] args ) {
		CircularLinkedLIstDemo s1 = new CircularLinkedLIstDemo ();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.display();
		s1.addMiddle();
		s1.display();
		s1.addLast();
		s1.display();
		s1.deleteFirst();
		s1.display();
		s1.deleteMiddle();
		s1.display();
		s1.deleteLast();
		s1.display();
		
	}

}
