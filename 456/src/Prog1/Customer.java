package Prog1;

import Prog1.Address;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	
	Address billingAddress;
	Address shippingAddress;
	
	public Customer(String firstName, String lastName, String socSecurityNum) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getSocSecurityNum() {
		return socSecurityNum;
	}


	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}


	public Address getBillingAddress() {
		return billingAddress;
	}


	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}


	public Address getShippingAddress() {
		return shippingAddress;
	}


	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}


	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
	}

}
