package practice2;

import java.util.Scanner;

public class SinglyLL77 {
	Node77 head;
	Scanner scan = new Scanner (System.in);
	
	public void addFirst ( int data ) {
		Node77 newNode = new Node77 (data) ;
		System.out.println("enter first data:");
		//int data = scan.nextInt();
		newNode.getData();
		if (head == null) {
			head = newNode ;
			return;
		}
		newNode.setNext(head) ;
		head = newNode;
	    }
	
	public void addLast () {
		Node77 newNode = new Node77 () ;
		System.out.println("enter last data:");
		int data = scan.nextInt();
		newNode.setData(data);
		if (head == null) {
			 head = newNode ;
			return;
		}
		Node77 temp = head ;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	    }
	
	
		// TODO Auto-generated constructor stub
	

	public void addMiddle ()
	{Node77 newNode = new Node77 () ;
	System.out.println("enter Middle data:");
	int data = scan.nextInt();
	newNode.setData(data);
	if (head == null) {
		head = newNode ;
		return;}
		Node77 temp  = head ;
		System.out.println("enter index:");
		int index = scan.nextInt();
		 for (int i =0; i< index-1 ;i++) {
			 temp= temp.getNext();
			 }
		 newNode.setNext(temp.getNext()) ;
		 temp.setNext(newNode) ;
		 }
	
	public void deleteFirst () {
		if (head == null) {
			System.out.println("list is already empty");
			return;
		}
		System.out.println("deleteFirst:");
		head = head.getNext();
	}
	
	public void deleteLast () {
		if (head == null) {
			System.out.println("list is already empty");
			return;
		}
		System.out.println("deleteLast:");
		Node77 temp = head ;
		while ( temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
	}
	
	public void deleteMiddle () {
		if (head == null) {
			System.out.println("list is already empty");
			return ;
		}
		Node77 temp = head ;
		System.out.println("enter index for delete middle:");
        int index = scan.nextInt();
        for (int i =0; i< index-1 ; i++) {
        	temp = temp.getNext() ;
        }
        temp.setNext(temp.getNext().getNext()) ;
	}
	 public void display () {
		 Node77 temp = head;
		 
		 while (temp != null) {
			 System.out.println(temp.getData());
			 temp = temp.getNext() ;
		 }
	 }
		
	}
		
	

	


