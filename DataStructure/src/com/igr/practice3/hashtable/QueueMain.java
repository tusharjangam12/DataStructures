package com.igr.practice3.hashtable;

import java.util.Scanner;

public class QueueMain {
	int data ;
	QueueMain next ;
	QueueMain head ;
	Scanner scan = new Scanner (System.in);
	
	public void nQueue () {
		QueueMain newNode = new QueueMain ();
		System.out.println("Enter data :");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head ;
		head = newNode;
	}
	
	public void dQueue () {
		if (head ==  null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("deletion:");
		QueueMain temp = head ;
		while (temp.next.next != null) {
			temp = temp.next ;
		} 
		temp.next = null ;
		
	}
 
	public void display () {
		QueueMain temp = head ;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next ;
		}
	}
	

	public static void main(String[] args) {
		QueueMain s = new QueueMain ();
		s.nQueue();
		s.nQueue();
		s.nQueue();
		s.nQueue();
		s.nQueue();
		s.display();
		System.out.println("..........................");
		s.dQueue();
		s.display();

	}

}
