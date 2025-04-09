package com.igr.exceptionhandling;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			try {
				System.out.println("Enter Number:");
				int num = sc.nextInt();
				System.out.println(10/num);
				System.out.println("Tushar".charAt(12));
				
			}
			catch  (Exception e) //parent of all exceptions
				{ System.out.println("Exception Handling" + e); }
		}
			System.out.println("Rest of the Code");

			//sc.close();
		}
		
	}


