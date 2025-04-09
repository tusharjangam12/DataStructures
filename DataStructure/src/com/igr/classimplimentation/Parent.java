    // INHERITANCE

package com.igr.classimplimentation;

public class Parent {
	int  x = 10;
	int  y = 20;
	
	static { System.out.println("parent class static block ");}
	
	{ System.out.println("parent class instance block");}
	
	Parent (){
		System.out.println("Parent class 0 arg constructor");
	}
	
	void m1 () {
		//System.out.println(x + y);
		System.out.println("parent class method");
	}
}
	

 
	 
	 
	