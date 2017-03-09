/* RESULT:
 * Display Status of Person: Yen1 445 27 Female 900 N 10th Director Manager 1990-11-11
 * Display Status of Person: Yen2 445 27 Female N Main Str Employee Employee 2017-03-08
 * Display Status of Person: Ha1 446 32 Male 900 N 10th 650 8.0 Software Engineer 2008
 * Display Status of Person: Ha2 446 32 Male S Main Str 641 8.0 Software Engineer 2008
 */
package Prog1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BigInteger df ;
    BigDecimal h;
    
    LocalDate fdf;
    Double a;
    
		ArrayList<Person> p = new ArrayList<Person>();
		Person e1 = new Employee("Yen1",445,27,"Female","900 N 10th", 929, "Director", "Manager", "1990-11-11");
		Person e2 = new Employee("Yen2",445,27,"Female","N Main Str", 641, "Employee", "Employee", "2017-03-08");
		Person s1 = new Student("Ha1",446,32,"Male","900 N 10th", 650, 8.0, "Software Engineer", 2008);
		Person s2 = new Student("Ha2",446,32,"Male","S Main Str", 641, 8.0, "Software Engineer", 2008);
	
		p.add(e1);
		p.add(e2);
		p.add(s1);
		p.add(s2);
		
		for(Person i :p){
			System.out.println("Display Status of Person: " +i.toString());
		}
	
	}

}
