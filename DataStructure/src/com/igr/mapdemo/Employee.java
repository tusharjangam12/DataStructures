package com.igr.mapdemo;

import java.util.List;

public class Employee implements Comparable <Employee> {
String EmpId;
String Name ;
List <Address> Addresses ;


public Employee() {
	super ();
}


public Employee(String empId, String name, List<Address> addresses) {
	super();
	EmpId = empId;
	Name = name;
	Addresses = addresses;
}


@Override
public String toString() {
	return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Addresses=" + Addresses + "]";
}

@Override
public int compareTo(Employee o) {
	//return this.EmpId.compareTo(o.EmpId);
		if (Integer.parseInt(this.EmpId) == Integer.parseInt(o.EmpId))
			return 0;
		else if (Integer.parseInt(this.EmpId) < Integer.parseInt(o.EmpId))
			return -1;
		else return 1 ;

}}
