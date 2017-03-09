package Prog4;

public class HourlyEmployee extends Employee implements Payable {

	private double wage;
	private double hour;
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hour) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hour = hour;
	}
	public double getPaymentAmount(){
		return wage + hour;
	}
}
