package com.igr.mapdemo;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map tm = new TreeMap ();
		Employee emp = new Employee ();
		emp.EmpId = "121" ;
		emp.Name = "Bunty";
		emp.Addresses  = new ArrayList<Address> (); 
		emp.Addresses.add(new Address("123","new delhi",AddressType.perm,"Delhi",402120));
		emp.Addresses.add(new Address("12 Lal mahal","Mumbai",AddressType.temp,"Maharashtra",402130));
        tm .put(1,emp);
        tm.put(212, new Employee ("333","Ratan",null));
        tm.put(445,new Employee("444","Durga",null));
        System.out.println(tm);
   TreeMap <Employee,String> tm1 = new TreeMap <> ();
   tm1.put(new Employee("888","Gaurav",null), null);
   tm1.put(new Employee("999","Anil",null), null);
   System.out.println(tm1);
	}

}
