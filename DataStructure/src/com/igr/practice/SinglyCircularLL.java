package com.igr.practice;

import java.util.Scanner;

public class SinglyCircularLL {
	Scanner scan = new Scanner (System.in);
	NodeSCLL head ; 
	
	
	public void addFirst () {
		NodeSCLL newNode = new NodeSCLL ();
		System.out.println("enter fisr data ");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			head = newNode ;
			newNode.next = head;
			return ;
		}
		NodeSCLL temp = head ;
		while (temp.next != head) {
			temp = temp.next;
		}
		newNode.next = head ;
		temp.next = newNode;
		newNode = head ;
		
	}
	
public void addMiddle () {
	NodeSCLL newNode = new NodeSCLL ();
	System.out.println("enter Middle data ");
	int data = scan.nextInt();
	newNode.data = data;
	if (head == null) {
		head = newNode ;
		newNode.next = head;
		return ;
		}
	NodeSCLL temp = head ;
	System.out.println("enter index :");
	int index = scan.nextInt();
	for (int i = 0 ; i< index-1 ; i++) {
		temp = temp.next ;
	}
	newNode.next = temp.next;
	temp.next = newNode;
	}
public void addLast (){
	NodeSCLL newNode = new NodeSCLL ();
	System.out.println("enter last data ");
	int data = scan.nextInt();
	newNode.data = data;
	if (head == null) {
		head = newNode ;
		newNode.next = head;
		return ;
		}
	NodeSCLL temp =head ;
	while (temp.next != head) {
		temp= temp.next;
	}
	temp.next = newNode ;
	newNode.next = head ;
}
 public void deleteFirst () {
	 
	 if (head == null) {
		 System.out.println("list is empty");
		 return;
	 }
	 System.out.println("delete first");
	 NodeSCLL temp = head;
	 while (temp.next != head ) {
		 temp = temp.next ;
	 }
	 head = head.next ;
	  temp.next = head;
	  
	 
	 
 }
 public void deleteMiddle () {
	 if (head == null) {
		 System.out.println("list is empty");
		 return;
	 }
	 NodeSCLL temp = head ;
	 System.out.println("enter index for delete middle:");
	 int index = scan.nextInt();
	 for (int i=0;i<index-1;i++) {
		 temp = temp.next;
	 }
	 temp.next = temp.next.next;
	}
 
  public void deleteLast () {
	  if (head == null) {
			 System.out.println("list is empty");
			 return;
		 }
	  System.out.println("delete last");
	  NodeSCLL temp = head ;
	  while (temp.next.next != head) {
		  temp = temp.next ;
	  }
	  temp.next = head ;
	  }
  public void display () {
	  NodeSCLL temp = head ;
	  do { System.out.println(temp.data);
	  temp= temp.next ;
	  }
	  while (temp != head) ;
  }
  
}
