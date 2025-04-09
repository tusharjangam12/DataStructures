package com.igr.exceptionhandling;

import java.util.Scanner;

public class ThrowKeyword {
	
	static void status (int age) throws InvalidAgeException
	{
		if (age > 20)
		{
			System.out.println("Eligible For Marrige");
		}
		else
		{
			throw new InvalidAgeException ();
		}
		
	}
	public static void main(String[] args) throws InvalidAgeException {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Age :");
		int age = s.nextInt();
		ThrowKeyword.status(age);

	}

}
