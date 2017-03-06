package w1pack.l2;

import java.util.*;

public class Prog7 {

	public static void main(String [] args){
		
		Scanner xx = new Scanner(System.in);
		System.out.println("Input: " );
		String a = xx.nextLine();
		
		
		System.out.println("Length of each String: " + a.length());
		
		int count = 0;
		for( int i = 0 ; i < a.length() ; i++)
		{
			if(a.substring(i, i+1).equals("A"))
				count++;		
		}
		System.out.println("Number of A letter: " + count);
	}
}
