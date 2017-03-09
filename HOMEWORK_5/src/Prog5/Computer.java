/* RESULT:
 * Check Override Equals
 * com1 ? com2 equals: true
 * com1 ? com3 equals: false
 * com1 ? com3 equals: false
 * Check Override HashCode
 * com1 ? com2 HashCode: true
 * com4 ? com3 HashCode: false
*/
package Prog5;

public class Computer {
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
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	double computePower(){
		return ramSize*processorSpeed;
	}
	@Override
	public String toString(){
		return manufacturer + " " + processor + " " + ramSize + " " + diskSize + " " + processorSpeed;
	}
	@Override
	public boolean equals(Object ob){
		if(ob == null) 
			return false;
		if(!(ob instanceof Computer)) 
			return false;
		Computer a = (Computer)ob;
		return a.manufacturer.equals(manufacturer) && a.processor.equals(processor);
		
	}
	@Override
	public int hashCode(){
		Integer ram = new Integer(ramSize);
		Integer disk = new Integer(diskSize);
		return manufacturer.hashCode()+processor.hashCode()+ram.hashCode(ramSize) 
		    + disk.hashCode(diskSize) + (int)Double.doubleToLongBits(processorSpeed);
	}
	
	public static void main(String [] args){
		Computer com1 = new Computer("IBM","A",4,256,3.5);
		Computer com2 = new Computer("IBM","A",4,256,3.5);
		Computer com3 = new Computer("Asus","B",8,256,1.5);
		Computer com4 = new Computer("Asus","C",8,256,1.5);
	
		//Check Override Equals
		System.out.println("Check Override Equals");
		System.out.println("com1 ? com2 equals: "+com1.equals(com2));
		System.out.println("com1 ? com3 equals: "+com1.equals(com3));
		System.out.println("com1 ? com3 equals: "+com4.equals(com3));
		//Check Override HashCode
		System.out.println("Check Override HashCode");
		System.out.println("com1 ? com2 HashCode: "+(com1.hashCode()==com2.hashCode()));
		System.out.println("com4 ? com3 HashCode: "+(com3.hashCode()==com4.hashCode()));
		
	}
}
