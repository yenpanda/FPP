/* RESULT:
 * Total salaries of all the employees: 6040.5
 */
package Prog4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(String firstName, String lastName, String socialSecurityNumber, double grossSales,
		//double commissionRate, double baseSalary) 
		
		Payable e[] = new Payable[5];
		e[0] = new CommissionEmployee("Yen1","Tran","12345",20.5, 929);
		e[1] = new HourlyEmployee("Navi","Tran","11111",20.5, 15);
		e[2] = new SalariedEmployee("Ha","Tran","3333",1000.0);
		e[3] = new BasePlusCommissionEmployee("Yen1","Tran","12345",20.5, 929,5005);
		e[4] = new Invoice("099","Mobile", 2, 2000);
		
		double sum = 0.0;
		for(Payable j : e){
			sum +=j.getPaymentAmount();
		}
		System.out.println("Total salaries of all the employees: " + sum);

	}

}
