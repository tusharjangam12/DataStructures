package com.igr.beginner.starprograms;

public class Practice3 {

	void practice () {
		for (int i = 0; i<= 4; i++) {
			for (int j = 3; j>=i ; j--) {
				System.out.print(" ");
			}
			for (int k=0; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		 Practice3  p = new  Practice3 ();
		 p.practice();

	}

}


