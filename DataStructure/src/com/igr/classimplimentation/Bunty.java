package com.igr.classimplimentation;

abstract class Bunty {
	
	{ System.out.println("Instance Block");}
	
	static {System.out.println("Static Block");}
	
	Bunty ()
	{System.out.println("Bunty constructor");}
	
	abstract void m1 ();

}
