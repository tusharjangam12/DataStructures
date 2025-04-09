package Practice;

import java.util.Scanner;

public class Singlyyy {
	
	Node1 head ;
	Scanner scan = new Scanner(System.in);
	
	public void addFirst () {
		Node1 newNode = new Node1 ();
		System.out.println("enter data :");
		int data = scan.nextInt();
		newNode.data = data ;
		newNode.next = head ;
		head = newNode ;
		
	}
		
	public void addLast () {
		Node1 newNode = new Node1() ;
		System.out.println("enter last data :");
		int data = scan.nextInt();
		newNode.data = data ;
		
		if (head == null) {
			System.out.println("list is empty");
			return ;}
		else {
				Node1 temp = head ;
				 while (temp.next != null) {
					 temp= temp.next ;
				 }
				  temp.next = newNode ;
			
		}
		
		
	}
	
		
	
	
	
	
	public void insertMiddle() {
		
		Node1 newNode = new Node1 ();
		System.out.println("enter middle data :");
		int data = scan.nextInt();
		newNode.data = data ;
		if (head == null) {
			System.out.println("list is empty");
			return ;
			}
		else {
		Node1 temp = head;
		System.out.println("enter index :");
		int index = scan.nextInt();
		for (int i = 0; i < index-1 ;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode ;
		}
			
		
		
	}
		
		
			
	
	
	public void deleteFirst () 
	{
		if (head == null) {System.out.println("list is empty :");}
	head = head.next ;
	}
		
		
	
	public void deleteMiddle () {
		 
		if (head == null)
		{System.out.println("list is empty :");
		return ;
	}
		Node1 temp = new Node1 () ;
		System.out.println("enter index: ");
		int index = scan.nextInt();
		for (int i = 0 ; i< index-1 ;i++) {
			temp = temp.next ;
		}
		temp.next = temp.next.next ; 
	}
		
	 public void deleteLast () {
		 if (head == null)
			{System.out.println("list is empty :");
			return ;
			}
		 else {
		 Node1 temp= head ;
		 while (temp.next.next != null) {
			 temp= temp.next ;
		 }
		 temp.next = null ;
		 
		 }
	 }
		
	 
	 public void findIndex () 
	 
	 {}
		 
		
		 
	 
	
	
	
	
	
	
	public void display () {
		Node1 temp = head ;
		while (temp != null) {
		System.out.println(temp.data);
		temp = temp.next ;
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		 
				  
			  }
				  
			  
			 
			 
			 
			 
			 
		 
	


