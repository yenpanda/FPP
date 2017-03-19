/* RESULT: 
 * Case 1: negative number
Input number: 
-1
You should not input out of the range from 0 to 100
The End
 * Case 2: non-number
Input number: 
s
Please input only Number
The End
 * Case 3: normal case
Input number: 
10
Your number: 10
The End
 */
package Prog1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input number: ");
		String s = in.nextLine();
		try{
			int i = Integer.parseInt(s);
			if(i < 0 || i > 100 )
				throw new InputMismatchException();
			System.out.println("Your number: " + i);
		}
		catch(InputMismatchException a ){	
			System.out.println("You should not input out of the range from 0 to 100");
		}
		catch(NumberFormatException b){
			System.out.println("Please input only Number");
		}
		finally{
			System.out.println("The End");
		}
	}

//		try{
//			Scanner in = new Scanner(System.in);
//			System.out.println("Input number: ");
//			int i = in.nextInt();
//			
//			if(i < 0 || i > 100)
//				throw new InputMismatchException();
//			System.out.println("Your number: " + i);
//		}
//		catch(InputMismatchException a ){	
//			System.out.println("You should not input out of the range from 0 to 100");
//		}
//		catch(NumberFormatException b){
//			System.out.println("Please input only Number");
//		}
//		finally{
//			System.out.println("The End");
//		}
//	}	
}
