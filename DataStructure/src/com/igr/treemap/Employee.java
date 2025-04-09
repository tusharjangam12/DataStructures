package com.igr.treemap;

import java.util.List;

public class Employee implements Comparable<Employee>{
	String empId;
	String empName; 
  List <Address> addresses;

  
  public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(String empId, String empName, List<Address> addresses) {
	this.empId = empId;
	this.empName = empName;
	this.addresses = addresses;
}


@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", addresses=" + addresses + "]";
}


@Override
public int compareTo(Employee o) {
   //	return this.empId.compareTo(o.empId); // String class have own compare to method for comaparison.
	
	if (Integer.parseInt(this.empId) == Integer.parseInt(o.empId) )
	return 0;
	else if (Integer.parseInt(this.empId) < Integer.parseInt(o.empId) )
    return -1 ;
	else
		return 1;
}
  
  
}
