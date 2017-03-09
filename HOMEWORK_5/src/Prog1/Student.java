package Prog1;

public class Student extends Person{
	private double iGPA;
	private String major;
	private int yearOfDraduation;
	public Student(String name, int socialSecurityNumber, int age, 
			String gender, String address, int telephoneNumber,
			double iGPA, String major, int yearOfDraduation) {
		
		super(name, socialSecurityNumber, age, gender, address, telephoneNumber);
		this.iGPA = iGPA;
		this.major = major;
		this.yearOfDraduation = yearOfDraduation;
	}
	
	public String toString(){
		return  name + " " + socialSecurityNumber + " " + age + " " + gender + " " +address+ " " +telephoneNumber + " " +  iGPA + " " + major+ " " + yearOfDraduation;
	}

}
