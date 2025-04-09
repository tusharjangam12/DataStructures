package com.igr.datastructure.singlylinklist;

public class MainF {

	public static void main(String[] args) {
		SinglylinkedlistDemo s1=new SinglylinkedlistDemo(); 
		s1.addFirst(); // 1 object tayar karun 4 value add karnyasathi slot tayar kele
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.addFirst();
		s1.display(); // tayar kelelya slot madhi value add jhalela data print honyasathi
		s1.insertMiddle();
		s1.display();
		System.out.println("..................");
		s1.insertLast();
		s1.display();
		System.out.println("..................");
		s1.deleteFirst();
		s1.display();
		System.out.println("..................");
		s1.deleteLast();
		s1.display();
		System.out.println("..................");
		s1.deleteMiddle();
		s1.display();
		
	}

}
