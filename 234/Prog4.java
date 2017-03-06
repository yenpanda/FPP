package w1pack.l2;

import java.util.*;

public class Prog4 {

	public static void main (String[] args)
	{
		@SuppressWarnings("resource")
		Scanner xx = new Scanner (System.in);
		System.out.println("Input your String: ");
		String input = xx.nextLine();
		System.out.println("INPUT: " +input);
		
		String result = "";
		for( int i = input.length() -1 ; i>=0 ; i--)
		{
			result = input.substring(i, i+1);
			System.out.print(result);
		}

	}
}
