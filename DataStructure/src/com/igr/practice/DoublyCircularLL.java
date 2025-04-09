package com.igr.practice;

import java.util.Scanner;

public class DoublyCircularLL {
	NodedoublyCLL head; 
	Scanner scan = new Scanner (System.in);
	
	  public void addFirst () {
		  NodedoublyCLL newNode = new NodedoublyCLL();
		  System.out.println("enter data :");
		  int data = scan.nextInt();
		  newNode.data = data ;
		  if (head == null) {
			  head = newNode ;
			  newNode.next = head;
			  newNode.pvs = head ; }
		  NodedoublyCLL temp = head;
		  while ( temp.next != head) {
			  temp = temp.next ;
		  }
		  temp.next = newNode;
		  newNode.pvs = temp;
		  newNode.next = head ;
		   head = newNode ;
		  
		  
		  
		  
		  }
	  
	  public void addLast () {
		  NodedoublyCLL newNode = new NodedoublyCLL();
		  System.out.println("enter last data:");
		  int data = scan.nextInt();
		  newNode.data = data ;
		  if (head == null) {
			  head = newNode;
			  newNode.next = head ;
			  newNode.pvs = head;
			  return ;
		  }
		  NodedoublyCLL temp = head;
		  while (temp.next != head) {
			  temp = temp.next ;
		  }  temp.next = newNode;
			 newNode.pvs = temp;
			 newNode.next = head ;
			 head.pvs = newNode ;
		  
	  }
	  public void addMiddle () {
		  NodedoublyCLL newNode = new NodedoublyCLL();
		  System.out.println("enter data for Middle:");
		  int data = scan.nextInt();
		  newNode.data = data ;
		  NodedoublyCLL temp = head ;
		  System.out.println("enter index");
		  int index = scan.nextInt();
		  for (int i=0;i< index- 1; i++) {
			  temp = temp.next ;
		  } 
		  newNode.next = temp.next ;
		  temp.next.pvs = newNode ;
		 temp.next = newNode ;
		 newNode.pvs = temp;
		  
	  }
	  
	  public void deletFirst() {
		  if (head == null) {
			  System.out.println("list is empty");
			  return ;
		  }
		  head.pvs.next = head.next;
		  head = head.next;
		  head.pvs = head.pvs.pvs ;
	  }
	  
	  public void deleteLast () {
		  if (head == null) {
			  System.out.println("list is empty");
			  return ;
		  }
		  head.pvs = head.pvs.pvs ;
		  head.pvs.next = head ;
	  } 
	  public void deleteMiddle () {
		  if (head == null) {
			  System.out.println("list is empty");
			  return ;}
		  NodedoublyCLL temp = head;
		  System.out.println("enter index for delete middle:");
		  int index = scan.nextInt();
		  for (int i=0 ; i< index-1 ;i++) {
			  temp = temp.next ;
			  } 
		  temp.next = temp.next.next ;
		  temp.next.pvs = temp ;
	  }
	  
	  
	  
	  
	  
	  public void display () {
		  NodedoublyCLL temp = head ;
		  do {System.out.println(temp.data);
		  temp = temp.next;}
		  while (temp!= head);
		  }
	  }


