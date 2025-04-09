package com.igr.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enetr a num:");
		int num = s.nextInt();
		try {
			System.out.println(10/num);
			try {
				System.out.println("Ratan".charAt(20));
			}
			catch (StringIndexOutOfBoundsException e)
			{ System.out.println("RatanIt");}
		}
		catch (ArithmeticException ae) {
			System.out.println("DurgaSoft");
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Rest Of the App");
		

	}

}
