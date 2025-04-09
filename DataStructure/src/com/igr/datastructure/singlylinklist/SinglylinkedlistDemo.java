
package com.igr.datastructure.singlylinklist;

import java.util.Scanner;

public class SinglylinkedlistDemo {
	Node head;
	Scanner scan = new Scanner(System.in);

	// 1. navin node la memory allocate karne, ani to navin node 'newNode' hya
	// variable la assign kera.

	public void addFirst() {
		Node newNode1 = new Node();

		// 2.user kadun input ghenyasthi
		System.out.println("Enter data : ");//
		int data = scan.nextInt(); // usr ne input kelela data verify karnyasathi integer ahe ki nhi check karyla
		newNode1.data = data; // new node la user ne dileli value assign karyala
		newNode1.next = head; // sarvat pudhe node ghenayasthi
		head = newNode1; // navin node la head kel
	}

	void insertLast() {
		
		Node newNode2 = new Node();
		Node temp = head;
		System.out.println("Enter data for last :");
		
		

		int data = scan.nextInt();
		newNode2.data = data;

		while (temp.next != null) {
			temp = temp.next;

		}
		temp.next = newNode2;
	}

	void insertMiddle() {
		Node newNode3 = new Node();
		System.out.println("enter new data : ");
		int data = scan.nextInt();
		newNode3.data = data;

		if (head == null) {
			System.out.println("the list is empty");
			return;
		} else {
			System.out.println("Enter index number : ");
			int index = scan.nextInt();
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;

			}
			newNode3.next = temp.next;
			temp.next = newNode3;

		}
	}

	void deleteFirst() {

		if (head == null) { 
			System.out.println("List is empty");
			return;
		} else
			head = head.next;
	}

	void deleteLast() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}

	}

	void deleteMiddle() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			Node temp = head;
			System.out.println("Enter index number : ");			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next; // temp.next=null
			}
			temp.next = temp.next.next;
		}
	}

	void findIndex() {
		Node temp = head;
		System.out.println("Enter the value : ");
		int index = scan.nextInt();
		int i = 0;
		while (temp != null) {
			if (i == index) {
				System.out.println(temp.data + "This is a Index number");

			}
			temp = temp.next;
			i++;

		}
	}

	public void display()

	{ // display karayla
		Node temp = head; // navin variable operation travelled karnyasathi survat head pasun
		while (temp != null) { // condition, head null nasel tr flow pudhe jail
			System.out.println(temp.data); // print karnyasathi
			temp = temp.next; // flow pudhe janyasathi
		}
	}

}

