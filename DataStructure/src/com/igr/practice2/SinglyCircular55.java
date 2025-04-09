package com.igr.practice2;

import java.util.Scanner;

public class SinglyCircular55 {

NodeSC55 head ;
	Scanner scan = new Scanner (System.in) ;
	
	public void addFisrt () {
		NodeSC55 newNode = new NodeSC55 ();
		System.out.println("enter first data:");
		int data = scan.nextInt();
		newNode.data = data ;
		 if (head == null) {
			 head = newNode ;
			 newNode.next = head ;
			 return;
		 }
		 NodeSC55 temp = head ;
		 while (temp.next!= head) {
			 temp = temp.next ;
		 } newNode.next = head ;
		   
		   head = newNode ;
		   temp.next = head ;
			}
	
	public void addLast() {
		NodeSC55 newNode = new NodeSC55 ();
		System.out.println("enter Last data:");
		int data = scan.nextInt();
		newNode.data = data ;
		 if (head == null) {
			 head = newNode ;
			 newNode.next = head ;
			 return;}
		 NodeSC55 temp = head ;
		 while (temp.next!= head) {
			 temp = temp.next ;
		 } temp.next = newNode ;
		 newNode.next = head ;
		 }
	
	public void addMiddle() {
		NodeSC55 newNode = new NodeSC55 ();
		System.out.println("enter Middle data:");
		int data = scan.nextInt();
		newNode.data = data ;
		 if (head == null) {
			 head = newNode ;
			 newNode.next = head ;
			 return;}
		 NodeSC55 temp = head ;
		 System.out.println("enter index:");
		 int index = scan.nextInt();
		 for ( int i=0 ; i< index-1 ; i++) {
			 temp = temp.next ;
		 }  newNode.next = temp.next ;
		    temp.next = newNode ;
	      }
     public void deleteFirst () {
    	 if (head == null) {
    		 System.out.println("list is empty");
    		 return ;
    	 }
    	 System.out.println("delete first :");
    	 NodeSC55 temp = head ;
    	 while (temp.next != head) {
    		 temp = temp.next ;
    	 }
    	 head = head.next ;
    	 temp.next = head ;
     }	
     public void deleteLast () {
    	 if (head == null) {
    		 System.out.println("list is empty");
    		 return ;
    	 }
    	 System.out.println("delete last:");
    	 NodeSC55 temp = head ;
    	 while (temp.next.next != head) {
    		 temp = temp.next ;
    		 }
    	 temp.next = head;
    	 }
     public void deleteMiddle () {
    	 if (head == null) {
    		 System.out.println("list is empty");
    		 return ;
    	 }
    	 NodeSC55 temp = head ;
    	 System.out.println("enterindex to delete last:");
    	 int index = scan.nextInt();
    	 for (int i =0 ; i< index-1 ; i++) {
    		 temp = temp.next ;
    	 }
    	 temp.next = temp.next.next ;
     }	
     
     public void display () {
    	NodeSC55 temp = head ;
    	do {
    		System.out.println(temp.data);
    		temp = temp.next ;
    	} while (temp != head) ;
     }

}
