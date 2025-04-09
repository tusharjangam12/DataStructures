package com.igr.practice3.hashtable;

import java.util.Scanner;

public class HashTableD2 {

		int data ;
		 HashTableD2  Next ;
		// HashTableD2  head ;
		 Scanner scan = new Scanner (System.in);
		 HashTableD2 [] HN = new HashTableD2 [16];	 
		
		 void addData ( int data) {
			 HashTableD2 newNode = new HashTableD2 ();
			   int index = data%16;
			   newNode.data = data;
			   HashTableD2 bucket2 = HN[index];
			   
			   if (HN[index]==null) {
				   HN[index]= newNode;
			   }
			   else {
				   HashTableD2 temp = bucket2 ;
				   
				   while (temp != null) {
					   if (temp.data == newNode.data ) {
						   System.out.println("duplicate data at "+ data + "at index" + index);
						   return;
					   }
					   temp = temp.Next ;
				   }
				   temp = bucket2 ;
				 while  (temp.Next != null) {
					   temp = temp.Next ;
				   }
				 temp.Next = newNode;
			   }
			   
		 }
		 
		 
		 void removeData () {
			 
			 
			 
		 }
		 
			public static void main(String[] args) {

	}

}
