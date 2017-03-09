package Prog6;

public class Computer implements Cloneable{
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	Object Clone() throws CloneNotSupportedException {

		Computer clone=(Computer)super.clone();
	    return clone;

	  }
	double computePower(){
		return ramSize*processorSpeed;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString(){
		return manufacturer + " " + processor + " " + ramSize + " " + diskSize + " " + processorSpeed;
	}

}
