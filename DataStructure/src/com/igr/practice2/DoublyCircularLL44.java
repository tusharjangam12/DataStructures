package com.igr.practice2;

import java.util.Scanner;

public class DoublyCircularLL44 {
	NodeDCLL44 head ;
	Scanner scan = new Scanner (System.in);
	
	
	public void addFirst() {
		NodeDCLL44 newNode = new NodeDCLL44 ();
		System.out.println("enter first data:");
		int data = scan.nextInt();
		newNode.data = data ;
		
		if (head == null) {
			head = newNode;
			newNode.pvs = head;
			newNode.next = head;
			return ;}
		NodeDCLL44 temp = head ;
		while (temp.next != head) {
		temp = temp.next ;}
		newNode.next = head; // head.pvs.next = newNode   
		temp.next = newNode ;  //newnode.pvs = head.pvs;
		newNode.pvs = temp ;  //newNode.next = head;
		head = newNode ;
		} 
	
	public void addLast () {
		NodeDCLL44 newNode = new NodeDCLL44 ();
		System.out.println("enter last data:");
		int data = scan.nextInt();
		newNode.data = data ;
		
		if (head == null) {
			head = newNode;
			newNode.pvs = head;
			newNode.next = head;
			return ;}
		NodeDCLL44 temp = head ;
		while (temp.next != head) {
		temp = temp.next ;}
		
		temp.next = newNode ;  // head.pvs.next =newNode 
		newNode.pvs =  temp ;  // newNode.next = head ;
		newNode.next  = head ;
		head.pvs=newNode;
		// newNode.pvs  = head.pvs.pvs ;
		                        //head.pvs = newNode;
	}
	
	public void addMiddle () {
		NodeDCLL44 newNode = new NodeDCLL44 ();
		System.out.println("enter Middle data:");
		int data = scan.nextInt();
		newNode.data = data ;
		
		if (head == null) {
			head = newNode;
			newNode.pvs = head;
			newNode.next = head;
			return ;}
		NodeDCLL44 temp = head ;
		System.out.println("enterindex:");
		 int index = scan.nextInt();
		 for (int i =0 ; i< index -1 ; i++) {
			 temp = temp.next ;
		 }  newNode.next = temp.next;
		    temp.next = newNode;
		   newNode.pvs = temp ;
		 }
	
	public void deleteFirst () {
		if (head == null) {
			System.out.println("list is empty");
			return ;
		}
		System.out.println("delete first");
        	
		 head.next.pvs = head.pvs;
	        head.pvs.next = head.next;
	        head = head.next; 
		
				 
				 
	}
	
	public void deleteLast () {
		if (head == null) {
			System.out.println("list is empty");
			return ;
		} System.out.println("delete last");
		head.pvs = head.pvs.pvs;
		head.pvs.next = head;
	}
	 public void deleteMiddle () {
		 if (head == null) {
				System.out.println("list is empty");
				return ;}
		 NodeDCLL44 temp = head ;
		 System.out.println("enter index:");
		  int index = scan.nextInt();
		  for (int i =0 ; i <index-1 ; i++) {
			  temp = temp.next;
		  }
		   temp.next = temp.next.next ;
		   temp.next.pvs = temp;
		   
	 }
	
	public void display () {
		NodeDCLL44 temp = head ;
		do { System.out.println(temp.data);
		 temp = temp.next ;}
		while (temp != head);
		 
		
	}

}
