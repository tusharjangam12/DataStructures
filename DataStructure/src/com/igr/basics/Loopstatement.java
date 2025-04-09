	package com.igr.basics;

import java.util.Scanner;

public class Loopstatement {
 

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int operator = scan.nextInt();
		
		switch(operator) {
		
		case 1 : System.out.println(a+b);
		break;
		case 2 : System.out.println(a-b);
		break ;
		case 3  : System.out.println(a*b);
		break;
		case 4 : if (b ==0) {System.out.println("invalid input");}
		else {System.out.println(a/b);}
		break;
		case 5 : if (b ==0) {System.out.println("invalid input");}
		else {System.out.println(a%b);}
		break;
		default : System.out.println("Invalid operator");
		}
	}

}
