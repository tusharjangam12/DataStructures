package com.igr.datastructure.doublylinklist;

import java.util.Scanner;

public class doublyLinkedListdemo {
	Scanner scan = new Scanner (System.in);
	Node head;
	
	public void addFirst () {
		Node newNode = new Node (); // navin object tayar karun memory allocate keli.
		System.out.println("enter Data :");
		int data = scan.nextInt();
		newNode.data = data;
		
		if (head == null) {  // corner case
			head = newNode ;
		    return;	
		}
		newNode.next = head ;
		head.prvs = newNode; // assign newnode to head previous reference
		head = newNode ;  // newnode assign to head
		}

	     
	
	
	
	    public void addLast () {
		Node newNode = new Node ();
		Node temp = head ;
		System.out.println("enter data last :");
		int data = scan.nextInt();
		newNode.data= data;
		
		if (head == null) {
			head = newNode ;
			return ;
		}
		 while (temp.next != null ) {
			 temp = temp.next ;
		 }
		 temp.next = newNode ;
		 newNode.prvs = temp;
		
		}
	
	
	
	  
	
	    public void addMiddle () {
	    	
		Node newNode = new Node ();
		Node temp = head ;
		
		System.out.println("enter data middle :");
		int data = scan.nextInt();
		newNode.data = data ;
		
		if (head == null) {
			head = newNode;
			return ;
					}
		System.out.println("enter index :");
		int index = scan.nextInt();
		for (int i = 0 ; i < index-1 ; i++) {
			temp =temp.next ;
		}
		newNode.next = temp.next;
		temp.next.prvs = newNode;
		temp.next = newNode ;
		newNode.prvs = temp ;
		
		}
	
	
	
	     public void deleteFirst () {
		if (head == null) {
			System.out.println("list is empty");
			return ;
			}
		
		head = head.next; // head cha prvs null asto tymule reffernce nahi deu shakat.
		
	}
	
	
	
	
	     public void deleteLast () {
		Node temp = head ;
		if (head == null) {
			System.out.println("list is empty");
			return ;
			}
		while (temp.next.next != null)
		{
			temp = temp.next ;
		} 
		   temp.next = null;
		    
		}
	
	
	
	
	
	public void deleteMiddle () {
		Node temp = head ;
		
		if (head == null) {
			System.out.println("list is empty");
			return ;
			}
		System.out.println("enter index number :");
		int index = scan.nextInt();
		  for (int i = 0 ; i< index-1 ; i++) {
			  temp = temp.next;
			  }
		  temp.next = temp.next.next;
		  }
	
	
	
	
	
	public void display () {
		Node temp = head ;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next ;
			
		}
			
	}
	
	
	
	

}
