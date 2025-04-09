package com.igr.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	Map<Object,Object>	 m1 =  new TreeMap <> ();
	Employee emp = new Employee ();
	emp.empId = "123";
	emp.empName = "Bunty";
	emp.addresses = new ArrayList<Address> ();
	emp.addresses.add(new Address ("12","LalMahal, Karve Road", AddressType.perm,"Maharashtra", 402120));
	emp.addresses.add(new Address ("134","KrushnKunj,Dadar(W)",AddressType.temp,"Maharashtra",402233));
	m1.put(1, emp);
	m1.put(234,new Employee("234", "Akshay",null));
	
	System.out.println(m1);
	
	Map <Employee,String> tm = new TreeMap ();
	tm.put(new Employee("234","Harshad",null), "1111");
	tm.put(new Employee("567","Vishal",null),"2222");
	System.out.println(tm);

	}

}
