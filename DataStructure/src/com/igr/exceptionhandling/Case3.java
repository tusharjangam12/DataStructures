package com.igr.exceptionhandling;

import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in) ;
		try {
			System.out.println("Enter Number:");
			int num = s.nextInt();
			System.out.println(10/num);
			System.out.println("Tushar".charAt(12));
			
		}
		catch  (ArithmeticException e) 
			{ System.out.println("Exception Handling... "); }
		catch (Exception e)
		{ System.out.println("Exception Handling..." + e);}
     
		System.out.println("Rest of the Code");

	}  // here one catch block contains AE but for remaining  give Exception parent class.

}
