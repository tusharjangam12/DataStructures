package com.igr.practice3.hashtable;

import java.util.Scanner;

public class HashTableDemo  {
	int data ;
	HashTableDemo next ;
	Scanner scan = new Scanner (System.in); //scanner class
	HashTableDemo  [] hn = new HashTableDemo  [16]; 	//TAKING 16 SLOT ARRAY OF HASHNODE CLASS

	void addData (int data) {  //METHOD CREATION
		
		HashTableDemo  newNode = new HashTableDemo ();  //OBJECT CREATION
		int index = data%16;   //INDEX THAT TAKE A DATAS MOD
		newNode.data = data;
		HashTableDemo bucket = hn[index];  		//CREATE A LOCAL VARIABLE BUCKET AND GIVE THEM INDEX OF HASHNODE TABLE

		if (hn[index]==null) //if index is place is null the create new node
		{hn[index]= newNode;}		
		else {
			HashTableDemo temp = bucket ;
			while(temp!=null) {
				if(temp.data==newNode.data) {
					System.out.println("The duplicate data" +data+"at index" + index );
				 return ;
				}  temp = temp.next ;
				}
			temp = bucket;
			while(temp.next!=null) {
				temp = temp.next ;
			}
			temp.next = newNode;
		}
		}
	
	
	void remove (int data) {
		
		int index =data % 16;   //DATA%16 ASSIGN TO INDEX
		HashTableDemo  bucket = hn[index]; 		//LOCAL VARIABLE BUCKET ASSIGN THE HN INDEX

		if (bucket == null) {    //CONDITION
			System.out.println("the list is empty");
			return;
		}
		if (bucket.data == data) {  		//CONDITIONIFTHE DATA IS AN FIRST NODE
           hn[index] = bucket.next;// head next become head
			System.out.println("the element"+ data + "is remove from" + index);
		}
		else {
			HashTableDemo temp = bucket ;  			//FIRST CREATING A TEMP VARIABLE FOR TRAVELING
			while (temp!=null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next ;
					System.out.println("remove from data" + data + "at index of" + index);
				return;
				}
				temp = temp.next ;
			}
		}
	}
	
	
	void show () 
	{for (int i=0 ; i<15 ;i++) {
		HashTableDemo bucket = hn[i];
		System.out.println("index::"+i);
		HashTableDemo travel = bucket;
		while (travel!=null) {
			System.out.println(travel.data);
			travel = travel.next;
		}
	}
		
	}
	
	public static void main(String[] args) {
		HashTableDemo ht = new HashTableDemo();
		ht.addData(16);
		ht.addData(32);
		ht.addData(48);
		ht.addData(34);
		ht.addData(16);
		ht.addData(90);
		ht.addData(400);
		ht.addData(45);
		ht.addData(87);
		ht.addData(65);
		ht.addData(90);
		ht.addData(34);
		ht.addData(90);
		ht.addData(45);
		ht.addData(45);
		ht.addData(48);
		ht.show();
		ht.remove(65);
		ht.remove(90);
		ht.remove(87);
		ht.remove(48);
		ht.show();
		
		
	}
	
}
