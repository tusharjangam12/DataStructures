package com.igr.exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}	
	catch (ArithmeticException e)
	{ System.out.println("Catch Block");}
	finally 
	{System.out.println("Finally Block");}
	}

}
