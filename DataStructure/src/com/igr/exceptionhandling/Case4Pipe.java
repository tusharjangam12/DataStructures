package com.igr.exceptionhandling;

import java.util.Scanner;

public class Case4Pipe {

	public static void main(String[] args) {
		try (Scanner s = new Scanner (System.in)) {  // try with resources no need to close scanner
			try {
				System.out.println("Enter Number:");
				int num = s.nextInt();
				System.out.println(10/num);
				System.out.println("Tushar".charAt(12));
				
			}
			catch  (ArithmeticException|NumberFormatException e) 
				{ System.out.println("Exception Handling" + e); }
			catch (StringIndexOutOfBoundsException|ClassCastException|NullPointerException a)
			{ System.out.println("Exception Handling 2" + a);}
		}
		System.out.println("Rest of the Code");

	}

}
