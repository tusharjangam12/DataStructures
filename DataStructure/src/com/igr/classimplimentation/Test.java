package com.igr.classimplimentation;

// Class contains 5 elements :-
// 1.variables : instance,static,local.   
// 2.methods: instance,static
// 3.constructors :- default(no argument) , user defined (parameterized)
// 4.instance block :- executes when object is created .
// 5.static block : execute when .class file create


public class Test {
	  int a = 10;   // instance variable
	  static int b = 20;  //  static variable
	 
	  void m1 (int a) {    //1 argument instance method
		 System.out.println("Instance Method m1"); 
	  }
	  
	 static void m2 (String str) { //local variable string  // static method 
		 System.out.println("Static Method m2");
	 }
	 
	 Test () { // 0 argument constructor
		 System.out.println("0 arg constructor");
	 }
	 
	 Test (int a)   // 1 argument constructor
	 {
		 System.out.println(" 1 arg constructor");
	 }
	 { System.out.println("Instance Block");} // instance block
	 
	 static {System.out.println("Iam the first bcz im StaticBlock ");} //static block
	
	

	public static void main(String[] args) {
		
		new Test ().m1(10); // nameless object creation
		Test t1 = new Test (23); // named object creation  
		//t.m1(10); 
		t1.m1(34); //instance method calls
		Test.m2("tushar"); //static method calls
		
          //  1. firstly static block was execute run time
		  //  2. instance block was run when object was created
		  //  3. constructor executes when object created
	      //  4. now instance method executes
	      //  5. static method calls by class name so it is directly executes 
	}     

}        
