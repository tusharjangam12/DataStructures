package com.igr.classimplimentation;

import java.util.ArrayList;
import java.util.TreeSet;

public class TushR {
	
	int rollNo ;
	String name;

	
	public static void main(String[] args) {
		TreeSet S = new TreeSet() ;
		S.add("akshay");
		S.add("bunty");
		S.add("gaurav");
		S.add("vaibhav");
		S.add("sajid");
		S.add("akash");
		S.add("babasaheb");
		//S.add(67);
		//S.add(54);
		
		TreeSet<TushR> T = new TreeSet();
		//T.add(new TushR(13,"bunty"));
		System.out.println(S);

	}

}
