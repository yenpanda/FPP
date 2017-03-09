package Prog4;

public class CommissionEmployee extends Employee implements Payable {

	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public String toString(){
		return firstName+ " " + lastName+ " " + socialSecurityNumber+ " " + grossSales+ " " + commissionRate;
	}
	
	public double getPaymentAmount(){
		return 0.0;
	}
}
