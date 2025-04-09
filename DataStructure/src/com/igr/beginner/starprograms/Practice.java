package com.igr.beginner.starprograms;

public class Practice {
	
	void Star () {
		for (int i=0; i<=5 ;i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		p.Star();

	}

}
