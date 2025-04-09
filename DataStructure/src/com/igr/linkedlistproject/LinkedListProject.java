package com.igr.linkedlistproject;

import java.util.Scanner;

import com.igr.datastructure.doublycircularlinkedlist.NodeDCLL;

public class LinkedListProject {
	static Node11 head = null;
	static Node11 tail = null;
	
	
	private static void display () {
		Node11 temp = head ;
		System.out.println("The List Is :");
		if (head == null)
		
			System.out.println("The List is Total Empty");
		else {
			while (temp != tail) {
				System.out.println("  "+ temp.data);
				temp  = temp.Next ;
			}
			System.out.println("  "+ temp.data);
			System.out.println();
		}
	}
	
	
	private static void addLinkedList (String data , Scanner scan) {
		Node11 newNode = new Node11 ();
		newNode.data = data ;
		if ( head == null) {
			newNode.Next = newNode ;
			newNode.prev = newNode ;
			head = newNode;
			tail = newNode ;
		}
		else {
		System.out.println("Do You Wanna Add Node At Begining (Enter 's') or At The End (Enter 'e') or In The Middle (Enter 'm') ");
	String choise = scan.next();
	switch (choise) {
	case "s" :   newNode.Next = head ;
	             newNode.prev = tail;
	             head.prev = newNode ;
	             tail.Next = newNode;
	             head = newNode;
	             break ;
	             
	case "e" :    newNode.Next = head ;
	              newNode.prev = tail;
	              head.prev = newNode ;
	              tail.Next = newNode;
	              
	              tail = newNode ;
	              break;
	case "m" :   
		Node11 temp = head ;
	      System.out.println("Enter index No:");
	      int index = scan.nextInt();
	      for (int i = 0; i< index-1 ; i++) {
	    	  temp = temp.Next ;
	      } newNode.Next = temp.Next ;
	      temp.Next = newNode ;
	      temp.Next.prev = newNode;
	      newNode.prev = temp;
	      break;
	default : 
		    System.out.println("You Enter Unexcepted Choise");
	}
		}
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean repeat = true ;
           display ();
           do {
        	   System.out.println("Do You Wanna Add Nodes To Linked List enter 1(for yes) or enter 0 (for no)");
           if (1 == scan.nextInt())
           {
        	   System.out.println("Enter Data :");
        	   String data = scan.next() ;
        	   
        	   addLinkedList(data,scan);
        	   display ();
        	   System.out.println("Do You Wanna Continue Adding Nodes in LL, enter 1 (for yes ) or 0 (for no)");
        	   if ( 1 != scan.nextInt()) {
        		   System.out.println("Thank You");
        		   repeat = false ;
        	   }
           }
           else 
           {
        	System.out.println("Thank You");
        	repeat = false ;
           }
        	   
           } 	while (repeat);
        	   
           
	}
}


