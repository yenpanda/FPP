package Prog2;

public class MyException extends Exception{
	MyException(){
		System.out.println("Balance reach below 100$");
	}

	MyException(double a){
		System.out.println("Withdraw amount exceed the balance");
	}
}
