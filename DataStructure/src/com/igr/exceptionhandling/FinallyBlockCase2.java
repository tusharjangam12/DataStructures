package com.igr.exceptionhandling;

public class FinallyBlockCase2 {

	public static void main(String[] args) {
		try 
		{System.out.println(10/0);}
		catch (ArithmeticException e)
		{System.out.println("Amar".charAt(12) );}
		finally
		{ int [] a = {1,2,3,4,5};
			System.out.println(a[8]);}
	}
}
// In these case Exception raised in try,catch,finally  every Blocks then JVM shows 
// The Exception which are Raised Recently so in these example when try block executes control
// goes to catch because its matched and then its go towards the finally block so 
// Finally block was recently raised exception and it shows in Output.