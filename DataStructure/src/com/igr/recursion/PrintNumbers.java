package com.igr.recursion;

public class PrintNumbers {
	
	void printNumbers (int n) {
		if (n == 1) {
			System.out.println("1");
			return ;
		}
		System.out.println(n);
		printNumbers(n-1);
	}

	public static void main(String[] args) {
		
		PrintNumbers p = new PrintNumbers ();
		p.printNumbers(10);

	}

}
