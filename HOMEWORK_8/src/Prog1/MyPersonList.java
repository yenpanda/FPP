/* RESULT:
 * My first List: [Person [lastName=Navi
 FirstName=Tran
Age=0], Person [lastName=Ha
 FirstName=Tran
Age=0], Person [lastName=Yen
 FirstName=Tran
Age=0]]
Inserted my list: [Person [lastName=Navi
 FirstName=Tran
Age=0], Person [lastName=NewMem
 FirstName=Tran
Age=0], Person [lastName=Ha
 FirstName=Tran
Age=0], Person [lastName=Yen
 FirstName=Tran
Age=0]]
After Removing: [Person [lastName=Navi
 FirstName=Tran
Age=0], Person [lastName=NewMem
 FirstName=Tran
Age=0], Person [lastName=Yen
 FirstName=Tran
Age=0]]
Is Anna exist? : false
 */
package Prog1;

import java.util.Arrays;

public class MyPersonList {
	private final int INITIAL_LENGTH = 2;
	private Person [] p; 
	private int size;
	
	public MyPersonList() {
		p = new Person[INITIAL_LENGTH];
		size = 0;
	}
	
	//@param: 1st Way: Add Object Person
	public void add(Person s){
		if(size == p.length) resize();
		p[size++] = s;
	}
	//@param: 2sd Way: Add by each instances.
	public void add(String last, String first, int age){
		Person tmp = new Person(last,first,age);
		if(p.length == INITIAL_LENGTH)
			p = Arrays.copyOf(p, INITIAL_LENGTH*2);
		p[size++] = tmp;
		
	}
	public Person get(int index){
		if(index < 0 || index >= size){
			return null;
		}
		return p[index];
	}
	
	private void resize(){
		System.out.println("resizing");
		int len = p.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(p,0,temp,0,len);
		p = temp;
	}
	
	public void insert(Person s, int pos){
		if(pos > size) return;
		if(pos >= p.length||size >= p.length) {
			resize();
		}
		Person[] temp = new Person[p.length+1];
		System.arraycopy(p,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(p,pos,temp,pos+1, p.length - pos);
		p = temp;
		++size;
		
	}
	
	public boolean find(String lastname){
		for(Person test : p){
			if(test != null && test.getLast().equals(lastname)) 
				return true;
		}
		return false;
	}
	
	public boolean remove(String last){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(p[i].getLast().equals(last)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[p.length];
		System.arraycopy(p,0,temp,0,index);
		System.arraycopy(p,index+1,temp,index,p.length-(index+1));
		p = temp;
		--size;
		return true;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(p[i]+", ");
		}
		sb.append(p[size-1]+"]");
		
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String []arg){
		MyPersonList l = new MyPersonList();
		//Add the 1st way
		l.add(new Person("Navi", "Tran", 2));
		
		//Add the 2nd way
		l.add("Ha","Tran",30);
		l.add("Yen","Tran",27);
		System.out.println("My first List: " + l.toString());
		
		//Insert new person
		
		l.insert(new Person("NewMem","Tran",12), 1);
		System.out.println("Inserted my list: "+ l.toString());
		
		//Remove one Person
		l.remove("Ha");
		System.out.println("After Removing: "+ l.toString());
		
		//find Person
		System.out.println("Is Anna exist? : " + l.find("newMem"));
	
	}
}
