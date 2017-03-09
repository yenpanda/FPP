package Prog2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Professor implements DeptEmployee{
	private String name;
	private double salary;
	private LocalDate hireDate;
	private int numberOfPublications;

	public Professor(String name, double salary, String hireDate, int numberOfPublications) {
		//super();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		this.hireDate = LocalDate.parse(hireDate, formatter);
		this.name = name;
		this.salary = salary;
		this.numberOfPublications = numberOfPublications;
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	 public double Salary(){
		return salary;
	}
	
}
