package w1pack.l2;

import java.util.*;

public class Prog1 {

	public static void main(String[] args){
		
		Integer x = RandomNumbers.getRandomInt(1, 9);
		Integer y = RandomNumbers.getRandomInt(3, 14);
		System.out.println("compute π^" + x +" = "+Math.pow(Math.PI, x) );
		System.out.println("compute "+ y + "^π = " +Math.pow(y,Math.PI) ); 
		
	}
}
