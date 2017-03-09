package Prog4;

public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable {

	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	@Override
	public String toString(){
		return firstName+ " " + lastName+ " " +socialSecurityNumber+ " " +grossSales
				+ " " + commissionRate+ " " +baseSalary;
	}
	public double getPaymentAmount(){
		return baseSalary;
	}
	
}
