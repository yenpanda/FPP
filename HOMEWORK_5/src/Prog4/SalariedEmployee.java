package Prog4;

public class SalariedEmployee extends Employee implements Payable {

	private double weeklySalary;
	
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public double getPaymentAmount(){
		return weeklySalary;
	}
	
	public String toString(){
		return firstName+ " " + lastName+ " " + socialSecurityNumber+ " " + weeklySalary;
	}
}
