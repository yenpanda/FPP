package Prog4;

public abstract class Employee implements Payable  {

	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getPaymentAmount(){
		return 0.0;
	}

	public String toString(){
		return firstName+" " +lastName+" " +socialSecurityNumber;
	}
	
}
