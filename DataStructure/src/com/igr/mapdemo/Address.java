package com.igr.mapdemo;

public class Address {
String AdrLine1;
String AdrLine2;
AddressType AddressType;
String State;
int Pincode;


public Address() {
	super ();
}


public Address(String adrLine1, String adrLine2, com.igr.mapdemo.AddressType addressType, String state, int pincode) {
	AdrLine1 = adrLine1;
	AdrLine2 = adrLine2;
	AddressType = addressType;
	State = state;
	Pincode = pincode;
}


@Override
public String toString() {
	return "Address [AdrLine1=" + AdrLine1 + ", AdrLine2=" + AdrLine2 + ", AddressType=" + AddressType + ", State="
			+ State + ", Pincode=" + Pincode + "]";
}



}
