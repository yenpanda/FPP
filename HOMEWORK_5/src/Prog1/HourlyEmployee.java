package Prog1;

public class HourlyEmployee extends Employee {
	private double hourlyRate;
	private double hoursWorked;
	private double unionDues;
	
	HourlyEmployee(String name, int socialSecurityNumber, int age, 
			String gender, String address, int telephoneNumber, 
			String department, String jobTitle, String dateOfHire, 
			double hourlyRate, double hoursWorked, double unionDues){
		super(name, socialSecurityNumber, age, gender, address, 
				telephoneNumber,department, jobTitle, dateOfHire);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.unionDues = unionDues;
	}

	public String toString(){
		return hourlyRate + " "+ hoursWorked + " " + unionDues;
	}
}
