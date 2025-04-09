package com.igr.exceptionhandling;

import java.util.Scanner;

public class ThrowKeyword2 {
	static void status (int age) throws InvalidAgeException2
	{
		if (age > 20)
		{
			System.out.println("Eligible for Marrige");
		}
		else 
		{
			throw new InvalidAgeException2("Not Eligible");
		}
	}
	public static void main(String[] args) throws InvalidAgeException2 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Age : ");
		int age = s.nextInt();
		ThrowKeyword2.status(age);
		
	}

}
