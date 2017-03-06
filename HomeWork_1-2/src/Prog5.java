package w1pack.l2;
import java.util.*;

public class Prog5 {
	
	public static void main (String[] args)
	{		
		Integer [][] arr = new Integer[4][4];
		
		arr[0][1] = RandomNumbers.getRandomInt(1, 99);
		arr[0][2] = RandomNumbers.getRandomInt(1, 99);
		arr[0][3] = RandomNumbers.getRandomInt(1, 99);
		arr[0][0] = RandomNumbers.getRandomInt(1, 99);
		arr[1][1] = RandomNumbers.getRandomInt(1, 99);
		arr[1][2] = RandomNumbers.getRandomInt(1, 99);
		arr[1][3] = RandomNumbers.getRandomInt(1, 99);
		arr[1][0] = RandomNumbers.getRandomInt(1, 99);
		arr[2][1] = RandomNumbers.getRandomInt(1, 99);
		arr[2][2] = RandomNumbers.getRandomInt(1, 99);
		arr[2][3] = RandomNumbers.getRandomInt(1, 99);
		arr[2][0] = RandomNumbers.getRandomInt(1, 99);
		arr[3][1] = RandomNumbers.getRandomInt(1, 99);
		arr[3][2] = RandomNumbers.getRandomInt(1, 99);
		arr[3][3] = RandomNumbers.getRandomInt(1, 99);
		arr[3][0] = RandomNumbers.getRandomInt(1, 99);
	
		int sum1 = arr[0][0] + arr[1][0];
		int sum2 = arr[0][1] + arr[1][1];
		int sum3 = arr[0][2] + arr[1][2];
		int sum4 = arr[0][3] + arr[1][3];
		int sum5 = arr[2][0] + arr[3][0];
		int sum6 = arr[2][1] + arr[3][1];
		int sum7 = arr[2][2] + arr[3][2];
		int sum8 = arr[2][3] + arr[3][3];
		
		System.out.println(" "+ arr[0][0]+ "	" + " "+ arr[0][1]+ "	" +" "+ arr[0][2]+ "	" +" "+ arr[0][3]+ "	");
		System.out.println("+"+ arr[1][0]+ "	" + "+"+ arr[1][1]+ "	" +"+"+ arr[1][2]+ "	" +"+"+ arr[1][3]+ "	");
		System.out.println();
		System.out.println("-----" + "	" + "-----" + "	" +"-----" + "	" +"-----" + "	");
		System.out.println(sum1 + "	" +sum2 + "	" +sum3 +  "	" +sum4  + "	");
		System.out.println();
		System.out.println(" "+ arr[2][0]+ "	" + " "+ arr[2][1]+ "	" +" "+ arr[2][2]+ "	" +" "+ arr[2][3]+ "	");
		System.out.println("+"+ arr[3][0]+ "	" + "+"+ arr[3][1]+ "	" +"+"+ arr[3][2]+ "	" +"+"+ arr[3][3]+ "	");
		System.out.println();
		System.out.println("-----" + "	" + "-----" + "	" +"-----" + "	" +"-----" + "	");
		System.out.println(sum5 + "	" +sum6 + "	" +sum7 +  "	" +sum8  + "	");
		
	}
}
