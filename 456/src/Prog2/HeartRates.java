package Prog2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class HeartRates {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
	
	HeartRates(String firstName,String lastName ,String dateOfBirth)
	{
		
		this.dateOfBirth = LocalDate.parse(dateOfBirth,formatter);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

	public int returnAge(LocalDate dateOfBirth){
		LocalDate today = LocalDate.now();
	    Period age = Period.between(dateOfBirth, today);
	    return age.getYears();
	}
	
	public int getMaxHeartRate(int ageYears){
   		int max = 220 - ageYears;
   		return max;
	}
	
	public float getTargetHeartRateRange(int maxRate){
		int restingHeartRate = 70;
		float lowerBoundary= (float) 0.5;
		float upperBoundary = (float) 0.85;
		float averageHeartRate = maxRate - restingHeartRate;
		float lowerBoundaryTargetHeartRate= (averageHeartRate*lowerBoundary) + restingHeartRate;
		float upperBoundaryTargetHeartRate= (averageHeartRate*upperBoundary) + restingHeartRate;
		
		return upperBoundaryTargetHeartRate - lowerBoundaryTargetHeartRate;
	}
	
	public String toString(){
		return "FirstName: " + firstName +" "+ "LastName: " + lastName +" "+
				"Date of Birth: " +dateOfBirth+" "+ "YearsOld: "+" " + returnAge(dateOfBirth) 
				+" " + "MaxHeartRate: " +getMaxHeartRate(returnAge(dateOfBirth)) +" " 
				+ " " + "TargetHeartRateRange: " + getTargetHeartRateRange(getMaxHeartRate(returnAge(dateOfBirth)));
	}
}
