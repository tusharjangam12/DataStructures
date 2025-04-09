package com.igr.treemap;

public class Address {

	String addrLine1;
	String addrLine2;
	AddressType adressType;
	String state;
	int pinCode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String addrLine1, String addrLine2, AddressType adressType, String state, int pinCode) {
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.adressType = adressType;
		this.state = state;
		this.pinCode = pinCode;
	}


	@Override
	public String toString() {
		return "Address [addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", adressType=" + adressType
				+ ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
}
