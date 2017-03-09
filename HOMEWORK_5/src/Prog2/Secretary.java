package Prog2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Secretary implements DeptEmployee{
	private String name;
	private double salary;
	private LocalDate hireDate;
	private double overtimeHours;
	public Secretary(String name, double salary, String hireDate, double overtimeHours) {
		//super();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		this.hireDate = LocalDate.parse(hireDate, formatter);
		this.name = name;
		this.salary = salary;
		this.overtimeHours = overtimeHours;
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	public double Salary(){
		return this.overtimeHours*12 + salary;
	}
	
	
	

}
