package Prog1;

public class SalariedEmployee extends Employee{
	private double annualSalary;

	SalariedEmployee(String name, int socialSecurityNumber, int age, 
			String gender, String address, int telephoneNumber, 
			String department, String jobTitle, String dateOfHire, double annualSalary){
		
		super(name, socialSecurityNumber, age, gender, address,
			  telephoneNumber, department, jobTitle, dateOfHire);
		this.annualSalary = annualSalary;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
}
