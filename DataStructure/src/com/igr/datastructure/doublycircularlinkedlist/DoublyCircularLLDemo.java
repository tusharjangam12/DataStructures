package com.igr.datastructure.doublycircularlinkedlist;

import java.util.Scanner;

public class DoublyCircularLLDemo {
 NodeDCLL head ;

 Scanner scan = new Scanner (System.in);
 
 public void addFisrt () {
	 NodeDCLL newNode = new NodeDCLL ();
	 System.out.println("enter first data :");
	 int data = scan.nextInt();
	 newNode.data = data ;
	 if (head == null) {
		 head = newNode;
		 newNode.pvs = head; // ekch node aslyane pvs ani next donhi headch asnr
		newNode.next = head;
		return;
	 }
 	 head.pvs.next = newNode ;
 	 newNode.pvs = head.pvs ;
 	head.pvs = newNode;
 	 newNode.next = head;
 	  head = newNode ;
} 
      
 
    public void addMiddle () {
	 NodeDCLL newNode = new NodeDCLL ();
	 System.out.println("enter middle data :");
	 int data = scan.nextInt();
	 newNode.data = data ;
	 if (head == null) {
		 head = newNode;
		 newNode.pvs = head;
		newNode.next = head;
		return;
	 }
      NodeDCLL temp = head ;
      System.out.println("enter index no:");
      int index = scan.nextInt();
      for (int i = 0; i< index-1 ; i++) {
    	  temp = temp.next ;
      } newNode.next = temp.next ;
      temp.next.pvs = newNode ;
      temp.next = newNode;
      newNode.pvs = temp;
       }
  public void addLast () {
	  NodeDCLL newNode = new NodeDCLL ();
		 System.out.println("enter last data :");
		 int data = scan.nextInt();
		 newNode.data = data ;
		 if (head == null) {
			 head = newNode;
			 newNode.pvs = head;
			newNode.next = head;
			return;
		 }
		 NodeDCLL temp = head ;
		 while (temp.next != head) {
			 temp = temp.next;
			 }
		 temp.next = newNode;
		 newNode.pvs = temp;
		 newNode.next = head ;
		 }
  
  public void deleteFirst () {
	  if (head == null)

	  {
		  System.out.println("list already empty:");
		  return;
	  }
	  System.out.println("delete first :");
	  NodeDCLL temp = head ;
	  while (temp.next != head) {
		  temp = temp.next;
	  }
	  
	  head = head.next;
	  head.pvs = temp ;
	  temp.next = head;
	  
	  }
  public void deleteMiddle 	()
  {
	  if (head == null)
	  {
		  System.out.println("list already empty:");
		  return;
	  }
	  NodeDCLL temp = head ;
	  System.out.println("enter index for delete middle:");
	  int index = scan.nextInt();
	  for (int i=0;i< index-1 ; i++) {
		  temp = temp.next;
	  }
	  temp.next = temp.next.next;
	  temp.next.pvs= temp ;
	  }
  
  public void deleteLast () {
	  if (head == null)
	  {
		  System.out.println("list already empty:");
		  return;
	  }
	  System.out.println("delete last:");
	 // NodeDCLL temp = head ;
	  head.pvs = head.pvs.pvs;
	  head.pvs.next= head ;
	  
	  
	 
  }
 public void display() {
	 NodeDCLL temp = head ;
	 if (head == null ) {
		 System.out.println("list is empty");
		 return;
		 
		 
	 }
	 do { System.out.println(temp.data);
	  temp  = temp.next ;
	 } while (temp != head);
 }
}