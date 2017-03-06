package Prog3;

import java.util.*;
import Prog3.MyDate;

public class Main {

public static void main(String arg[]){  
		
	int flag = 0;
	Scanner in = new Scanner(System.in);
	
	while (flag==0) {
	System.out.println("Enter 1 for format: MM/DD/YYYY");
	System.out.println("Enter 2 for format: Month DD, YYYY");
	System.out.println("Enter 3 for format: DDD YYYY");
	System.out.println("Enter 4 to exit");
	System.out.println("Choose your Choice :");
	
	int choice = in.nextInt();
	switch(choice) {
		case 1:
		
			System.out.println("Choice: 1");
			System.out.println("Enter Month:");
			int month = in.nextInt();
			System.out.println("Enter Day:");
			int day = in.nextInt();
			System.out.println("Enter Year:");
			int year = in.nextInt();
			MyDate date1 = new MyDate(month, day, year);   

			System.out.println("Do you want to Continue :");
			String yesOrNo = in.next();

			if (yesOrNo.equals("Y")||yesOrNo.equals("y")) {
				break;
			}
            if (yesOrNo.equals("N")||yesOrNo.equals("n")) {
				flag = 1;
				System.out.println("Finished");
				break;
			}
			
		case 2:
			
			System.out.println("Choice: 2");
			System.out.println("Enter Month:");
			String monthMM = in.next();
			System.out.println("Enter Day:");
			int dayDD = in.nextInt();
			System.out.println("Enter Year:");
			int yearYYYY = in.nextInt();
			MyDate date2 = new MyDate(monthMM, dayDD, yearYYYY); 
			System.out.println("Do you want to Continue :");
			String yesOrNo2 = in.next();
	
			if (yesOrNo2.equals("Y")||yesOrNo2.equals("y")) {
				break;
			}
            if (yesOrNo2.equals("N")||yesOrNo2.equals("n")) {
				flag =1;
				System.out.println("Finished");
				break;
			}
			
		case 3:
			
			System.out.println("Choice: 3");
			
			System.out.println("Enter Day:");
			int dayD = in.nextInt();
			System.out.println("Enter Year:");
			int yearY = in.nextInt();
			MyDate date3 = new MyDate(dayD,yearY); 
			System.out.println("Do you want to Continue :");
			String yesOrNo3 = in.next();

			if (yesOrNo3.equals("Y")||yesOrNo3.equals("y")) {
				break;
			}
            if (yesOrNo3.equals("N")||yesOrNo3.equals("n")) {
				flag=1;
				System.out.println("Finished");
				break;
			}
		case 4:  
			flag=1;

			System.out.println("Exit");
			break;
		default:
			flag=1;

			System.out.println("Finished");
			break;
		}		
	}
  }
}
