package Prog1;

public class Person{
	public String name;
	public int socialSecurityNumber;
	public int age;
	public String gender;
	public String address;
	public int telephoneNumber;
	public Person(String name, int socialSecurityNumber, int age, String gender, String address, int telephoneNumber) {
		super();
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}
	public String getName() {
		return name;
	}
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	

	
}
