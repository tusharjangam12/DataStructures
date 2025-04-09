     //INHERITANCE

package com.igr.classimplimentation;

public class Child extends Parent {
	int x =100;  // variables are same but values different in child class and parent class
	int y =200;
	static 
	 { System.out.println("child class static block ");}
	 
	 {System.out.println("child class instance block ");}
	 
	 void add () {
		 this.m1();     // calling current class method by this keyword
		 System.out.println(x + y);
	 }
	 void m1 ()
	 {
		 
		 System.out.println(super.x + super.y); // calling parent class variables
	 }
	 Child (){
		 System.out.println("child class 0 arg constructor ");
	 }
	public static void main(String[] args) {
		new Child ().add();;
	}
	}
     //  1. firstly static blocks are executed of both class during .class files generated
     //  2. instance block are execute of parent class
     //  3. constructor executes of parent class
     //  4. instance block are execute of child class.
     //  5. constructor executes of child class. 
     //  6. then method executes.....
