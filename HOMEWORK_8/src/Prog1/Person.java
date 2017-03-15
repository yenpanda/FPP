package Prog1;

public class Person {
	
	private String lastName;
	private String firstName;
	private int age;
	// -------------------------------------------------------------- 
	public Person(String last, String first, int age) { // constructor
	lastName = last;
	firstName = first;
	age = age;
	} 
	
	
	// -------------------------------------------------------------- 
	public String getLast(){ 
		return lastName;
	}
	
	@Override
	public String toString() {
	return "Person [lastName=" + lastName + "\n FirstName=" + firstName +
	"\nAge=" + age + "]"; }

}
