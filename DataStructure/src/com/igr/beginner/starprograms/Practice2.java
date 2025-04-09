package com.igr.beginner.starprograms;

public class Practice2 {
	
	void Star3 () {
		for (int i = 0; i<=4; i++) {
			for (int j =0; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =0; i<=4; i++) {
			for(int j=4 ; j>=i ; j--) {
				System.out.print("*");
			}System.out.println();
		}

		
	}

	public static void main(String[] args) {
		Practice2 p = new Practice2 ();
		p.Star3();
	}

}

//*
//**
//***
//****
//*****
//*****
//****
//***
//**
//*