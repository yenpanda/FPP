package Prog6;

public class Person implements Cloneable {
	String name;
	Computer computer;
	public Person(String name, Computer computer) {
		super();
		this.name = name;
		this.computer = computer;
	} 
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	Object Clone() throws CloneNotSupportedException {

		Person clone=(Person)super.clone();
		//Add Clone to Computer ( Deep Clone) 
		clone.computer = (Computer)this.computer.Clone();
	    return clone;

	  }
	public String toString(){
		return name + " " + computer;
	}
}
