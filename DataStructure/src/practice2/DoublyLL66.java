package practice2;

import java.util.Scanner;

public class DoublyLL66 {
	NodeDLL66 head ;
	Scanner scan = new Scanner (System.in);
	
	public void addFirst () {
		NodeDLL66 newNode = new NodeDLL66 ();
		System.out.println("enter first data:");
		int data = scan.nextInt();
		newNode.data = data ;
		if (head == null) {
			head = newNode ;
			newNode.pvs = head;
			return ;
		}
		newNode.next = head ;
		head.pvs = newNode ;
		head = newNode ;
	}
	
	public void addLast () {
		NodeDLL66 newNode = new NodeDLL66 ();
		System.out.println("enter last data:");
		int data = scan.nextInt();
		newNode.data = data ;
		if (head == null) {
			head = newNode ;
			newNode.pvs = head;
			return ;}
		NodeDLL66 temp = head ;
		while ( temp.next != null) {
			temp = temp.next ;
		} temp.next = newNode ;
		newNode.pvs = temp;
	}
	
	public void addMiddle () {
		NodeDLL66 newNode = new NodeDLL66 ();
		System.out.println("enter middle data:");
		int data = scan.nextInt();
		newNode.data = data ;
		if (head == null) {
			head = newNode ;
			newNode.pvs = head;
			return ;}
		NodeDLL66 temp = head ;
		System.out.println("enter index:");
		int index = scan.nextInt();
		for (int i =0 ; i < index-1 ; i++) {
			temp = temp.next ;
		}
		newNode.next = temp.next;
		temp.next = newNode ;
		newNode.pvs = temp ;
	}
	
	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty");
			return ;
		}
		System.out.println("delete fisrt");
		head = head.next ;
		
	}
	
	public void deleteLast () {
		if (head == null) {
			System.out.println("list is empty");
			return ;}
		System.out.println("delete last");
		NodeDLL66 temp = head ;
		while ( temp.next.next != null) {
			temp = temp.next ;
		} 
		temp.next = null;
		
	}
	
	public void deleteMiddle () {
		if (head == null) {
			System.out.println("list is empty");
			return ;}
		NodeDLL66 temp = head ;
		System.out.println("enter index for deleteMiddle:");
		int index = scan.nextInt() ;
		for ( int i=0; i < index -1 ; i++ ) {
			temp = temp.next ;
		}  temp.next = temp.next.next ;
	}
	
	public void display () {
		NodeDLL66 temp = head ;
		while ( temp != null) {
			System.out.println(temp.data);
			temp = temp.next ;
		}
	}

}
