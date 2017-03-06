package w1pack.l2;

import java.util.*;

public class Prog6 {

	public static void RemoveDups(String input[])
	{
		ArrayList<String> update = new ArrayList<String>();
		
	    for(int i= 0; i < input.length ; i++)
	    {
	    	int j = 0;
	    	for( ; j < update.size(); j++)
	    	{
	    		if(input[i].equals(update.get(j)))
	    			break;
	    	}
	    	if(j == update.size() )
	    		update.add(input[i]);
	    }	
		System.out.println("Removed Duplicate String: "+update);			
	}
	
	public static void main (String[] args)
	{
		String test[] = {"horse", "dog", "cat", "horse","dog"};
		RemoveDups(test);		
	}
}
