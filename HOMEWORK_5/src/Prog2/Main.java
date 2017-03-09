/* RESULT: 
 * Do you want to see Sum of Salaries? 
 * Y
 * Sum of Professor: 9000.0
 * Sum of Professor: 11078.0
 * All Sum of Salaries: 20078.0
 */
package Prog2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeptEmployee [] deptE = new DeptEmployee[5];

		DeptEmployee p1 = new Professor("Yen",2000.0, "2010-08-03",5);
		DeptEmployee p2 = new Professor("Navi",3000.0, "2010-08-03",4);
		DeptEmployee p3 = new Professor("Ha",4000.0, "2010-08-03",3);
		DeptEmployee s1 = new Secretary("A",5000.0, "2010-08-03",3.5);
		DeptEmployee s2 = new Secretary("B",6000.0, "2010-08-03",3.0);
		deptE[0] = p1;
		deptE[1] = p2;
		deptE[2] = p3;
		deptE[3] = s1;
		deptE[4] = s2;
		double sumPro = p1.Salary() + p2.Salary() + p3.Salary();
		double sumSec = s1.Salary() + s2.Salary();
		System.out.println("Do you want to see Sum of Salaries? ");
		
		Scanner s = new Scanner(System.in);
		String enter = s.nextLine();
		if(enter.equals("Y") || enter.equals("y")){
			double sum = 0;
			for(DeptEmployee i : deptE){
				sum += i.Salary();
			}
			System.out.println("Sum of Professor: " +sumPro);
			System.out.println("Sum of Professor: " +sumSec);
			System.out.println("All Sum of Salaries: "+sum);
			
		}
		else 
			System.out.println("Finished");
			return;
		
	}

}
