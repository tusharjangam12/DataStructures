package practice3HashTable;

import java.util.Scanner;

public  class StackMain {
	
	int data ;
	StackMain next;
	StackMain head ;
	Scanner scan = new Scanner (System.in);
	
	
     public void push () {
    	 StackMain newNode = new StackMain ();
    	 System.out.println("Enter last Data:");
    	 int data = scan.nextInt();
    	 newNode.data = data ;
    	 StackMain temp = head ;
    	 if (head ==null) {
    		 head = newNode;
    		 return;
    	 }
    	 while (temp.next != null) {
    		 temp = temp.next ;
    	 } temp.next = newNode ;
     }
     
     public void pop () {
    	 
    	 StackMain temp = head ;
    	 System.out.println("delete last");
    	 while (temp.next.next != null) {
    		 temp = temp.next ;
    	 } temp.next = null  ;
     }
     
     
     public void display () {
    	 StackMain temp = head ;
    	 while (temp != null) {
    		System.out.println(temp.data);
    		 temp = temp.next ;
    	 } 
    	 
    	 
     }
	public static void main(String[] args) {
		StackMain s = new StackMain ();
		s.push();
		s.push();
		s.push();
		s.push();
		s.display();
		System.out.println("..........................");
		s.pop();
		s.display();

	}

}
