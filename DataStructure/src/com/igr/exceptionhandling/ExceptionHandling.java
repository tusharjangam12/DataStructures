package com.igr.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {
 

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in) ;
		try {
			System.out.println("Enter Number:");
			int num = s.nextInt();
			System.out.println(num/10);
			System.out.println("Tushar".charAt(12));
			
		}
		catch  (ArithmeticException e) 
			{ System.out.println("AirthmeticException"); }
		catch (StringIndexOutOfBoundsException e)
		{ System.out.println("String IndexOutofbound");}
     
		System.out.println("Rest of the Code");
	}

}
