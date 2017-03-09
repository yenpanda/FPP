package Prog1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person{
	private String department;
	private String jobTitle;
	private LocalDate dateOfHire;
	
	
	Employee(String name, int socialSecurityNumber, int age, 
			String gender, String address, int telephoneNumber, 
			String department, String jobTitle, String dateOfHire){
		
		super(name, socialSecurityNumber, age, gender, address, telephoneNumber);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		this.department = department;
		this.jobTitle = jobTitle;
		this.dateOfHire = LocalDate.parse(dateOfHire, formatter);
	}

	@Override
	public String toString(){
		
		return name+ " " +socialSecurityNumber + " " +age + " " + gender + " " 
                + address+ " " +  department + " " + jobTitle + " " + dateOfHire;
	}
}
