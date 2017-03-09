/* RESULT:
 * ----Shallow copy Clone()----
 * Before Clone
 * Yen IBM A 4 256 3.5
 * After Clone
 * Yen IBM A 4 256 3.5
 * *After change the Name*
 * Navi IBM A 4 256 3.5
 * ----Deep copy Clone()----
 * Before Deep Clone
 * Navi IBM A 4 256 3.5
 * After Deep Clone
 * Navi Mac A 4 256 3.5
 */
package Prog6;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Computer com1 = new Computer("IBM","A",4,256,3.5);
		Computer com2 = new Computer("IBM","A",4,256,3.5);
		Computer com3 = new Computer("Asus","B",8,256,1.5);
		Computer com4 = new Computer("Asus","C",8,256,1.5);
	
		//Check Shallow copy Clone()
		Person p = new Person("Yen",new Computer("IBM","A",4,256,3.5));
		System.out.println("----Shallow copy Clone()----");
		System.out.println("Before Clone");
		System.out.println(p);
		System.out.println("After Clone");
		Person p1 = (Person) p.Clone();
		System.out.println(p1);
		
		p.setName("Navi");
		System.out.println("*After change the Name*");
		System.out.println(p);
		
		System.out.println("----Deep copy Clone()----");
		
		System.out.println("Before Deep Clone");
		System.out.println(p);
		p.computer.setManufacturer("Mac");
		System.out.println("After Deep Clone");
		System.out.println(p.Clone());
		
	}

}
