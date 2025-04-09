package Practice;

import java.util.Scanner;

public class Node2 {
	int data ;
	Node2 next ;
	Node2 head;
	Scanner scan = new Scanner (System.in);
	
	
	    public void addFirst() {
		Node2 newList = new Node2 ();
		
		System.out.println("Enter:");
		int data = scan.nextInt();
		newList.data= data ;
		newList.next= head ;
		head = newList ;
		}
	
	  public void display () {
		Node2 temp1 = head ;
		while (temp1 != null)
		{
		System.out.println(temp1.data);
		temp1 = temp1.next ;
		}
	  }
	
		
	  public static void main (String[] args) {
		  Node2 s1 = new Node2 ();
		  s1.addFirst();
		  s1.addFirst();
		  s1.addFirst();
		  s1.addFirst();
		  s1.display();
		  
	  }
			
	  }
	


