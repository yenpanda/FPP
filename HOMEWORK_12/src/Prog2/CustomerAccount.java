/* RESULT:
 * Case 1:  
Balance reach below 100$
The end
 * Case 2: 
Withdraw amount exceed the balance
The end
 */
package Prog2;

public class CustomerAccount{
	
	private String cus_name;
	private String acc_No;
	private double balance;
	

	public CustomerAccount(String cus_name, String acc_No, double balance) {
		super();
		this.cus_name = cus_name;
		this.acc_No = acc_No;
		this.balance = balance;
	}

	public double deposit( double a){
		return this.balance = balance + a;
	}
	
	public double withdraw( double a){
		return this.balance = balance - a;
	}

	
	public static void main(String[] args) throws MyException{
		// TODO Auto-generated method stub
		
		CustomerAccount cus = new CustomerAccount("Yen","1111",500);
		cus.deposit(200);  // Use to check 2 case
		double chk = cus.withdraw(600);
		
		try{
			if(chk < 0)
				throw new MyException();
			if(cus.balance <= 100)
				throw new MyException(chk);
			System.out.println("Transaction success!");
		}
		catch(MyException a){
		}
		finally{
			System.out.println("The end");
		}

	}

}
