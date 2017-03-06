package Prog1;

import java.util.*;

import Prog1.Customer;

public class Main {
	public static void main(String [] args){
	
	Customer c1 = new Customer("A", "Panda", "12345");
	Customer c2 = new Customer("B", "Panda", "12367");
	Customer c3 = new Customer("C", "Panda", "12389");
	Address add1 = new Address("N 4th ", "Fairfield","IA", "52556");
	Address add2 = new Address("S 4th ", "Richland","NY", "52556");
	Address add3 = new Address("E 4th ", "Chicago","CO", "52556");
	c1.setBillingAddress(add1);
	c2.setBillingAddress(add2);
	c3.setBillingAddress(add3);
	
	ArrayList<Customer> lsCus = new ArrayList<Customer>();
	//Merge instance of Customer to Array list Customer
	lsCus.add(c1);
	lsCus.add(c2);
	lsCus.add(c3);
	
	for(Customer i : lsCus)
	{
		//if(i.getBillingAddress().getCity().equals("Chicago"))
		if(i.billingAddress.getCity().equals("Chicago"))
		{
			System.out.println(i.toString());
		}
	}
	}
}