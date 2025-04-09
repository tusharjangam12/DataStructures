package com.igr.datastructure.circularlinkedlist;

import java.util.Scanner;

public class CircularLinkedLIstDemo {
	 Node head ;
	  Scanner scan = new Scanner (System.in);
	  
	  public void addFirst () {
		  Node newNode = new Node () ;
		  System.out.println("enter data:");
		  int data = scan.nextInt();
		  newNode.data = data ;
		  if (head == null) {
		  head = newNode ;
			  newNode.next = head ;
			  return;
		  }
		  Node temp = head ;
		  while ( temp.next != head  ) {
			  temp = temp.next ;
			  
		  }
		 
		 
		  newNode.next = head  ;
		  temp.next = newNode;
		  head = newNode ;
		  }
	  
	  
	  public void display () {
		  
		Node temp = head ;
		  
		  do {
			  System.out.println(temp.data);
			  temp = temp.next;
			  }
		  while (temp != head);
			   }
	  
	  
	  public void addLast () {
		  Node newNode = new Node ();
		  System.out.println("enter data for Last");
		  int data = scan.nextInt();
		  newNode.data = data ;
		  Node temp = head ;
		  while (temp.next != head) {
			  temp = temp.next;
		  }
		  temp.next= newNode;
		  newNode.next= head ;
		  
	  }
	  
	  public void addMiddle () {
		  Node newNode = new Node ();
		  System.out.println("enter data for Middle :");
		  int data = scan.nextInt();
		  newNode.data =data ;
		  Node temp = head ;
		  System.out.println("enter index :");
		  int index = scan.nextInt();
		  for (int i =0; i< index-1 ; i++) {
			  temp = temp.next ;
		  }
		  newNode.next = temp.next ;
		  temp.next = newNode ;
		  
	  }
	  
	  public void deleteFirst () {
		  if (head == null) {
			  System.out.println("list is empty");
			  return;
		  }
		  
		  System.out.println("delwete fisrt ");
		  Node temp = head ;
		  while (temp.next != head) {
			  temp = temp.next ;
			  }
		  head = head.next ;
		  temp.next = head ;
		  
	  }
	  
	  
	  public void deleteMiddle () {
		  Node temp = head ;
		  System.out.println("enter index for delete middle :");
		  int index = scan.nextInt();
		  for (int i = 0 ; i< index-1; i++) {
			  temp = temp.next ;
		  }
		  temp.next = temp.next.next;
	  }
	  
	  
	  
	  public void deleteLast () {
		  Node temp = head ;
		  System.out.println("delete last");
		  while (temp.next.next != head) {
			  temp = temp.next ;
			 }
		  temp.next = head ;
	  }
	  
	  }
			  
		  
		  
			  
		  
	  


