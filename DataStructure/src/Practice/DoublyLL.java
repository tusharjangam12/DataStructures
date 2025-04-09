package Practice;

import java.util.Scanner;

public class DoublyLL {
	NodeDLL head;
	Scanner scan = new Scanner (System.in);
	
	public void addFirst () {
		NodeDLL newNode = new NodeDLL ();
		System.out.println("enter data first");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		}
		newNode.next = head ;
		head.pvs = newNode;
		head = newNode;
		
			
	}
	
		
		
	
	public void addMiddle () {
		NodeDLL newNode = new NodeDLL ();
		System.out.println("enter data middle:");
		int data = scan.nextInt();
		newNode.data= data ;
		if (head == null) {
			head = newNode;
			return;}
		NodeDLL temp = head ;
		System.out.println("index:");
		int index = scan.nextInt();
		for (int i=0; i<index-1;i++) {
			temp = temp.next;
					}
		newNode.next = temp.next;
		temp.next = newNode ;
		newNode.pvs = temp;
		
		
		
		
		
		
	}
	
	
	public void addLast () {
		NodeDLL newNode = new NodeDLL ();
		System.out.println("enter data last:");
		int data = scan.nextInt();
		newNode.data= data ;
		if(head == null) {
			head = newNode;
			return;}
		NodeDLL temp = head ;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.pvs = temp;
		
		
		}
	

	
	
	
	public void deleteFirst () {
		if (head == null) {
			System.out.println("list is empty");
			return;
			}
		System.out.println("delete first");
		head = head.next;
	}
	
	
	
	public void deleteMiddle () {
		if (head==null) {
			System.out.println("list is empty");
			return;
		}
		NodeDLL temp = head;
		System.out.println("enter index for delete middle");
		int index = scan.nextInt();
		for (int i =0; i<index-1;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	public void deleteLast () {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("delete last:");
		NodeDLL temp = head ;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next= null;
		
	}
	
	
	
	
	public void display () {
		
		NodeDLL temp = head ;
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	

}
