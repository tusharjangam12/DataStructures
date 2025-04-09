package com.igr.classimplimentation;

import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		int [] marks = new int [5];
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i < marks.length ; i++)
		{System.out.println("Enter Marks:");
		marks [i] = scan.nextInt();}

		for (int i =0 ;i<5;i++)
		{ System.out.println(marks[i]); }
	}

}
