package Prog4;

import java.util.*;
import Prog4.*;

public class Main {
	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input your choice ( R or C or T): ");
		String a = input.nextLine();
		
		switch(a)
		{
		case "C":
			Scanner radius = new Scanner(System.in);
			System.out.println("Enter the radius of the Circle: ");
			Double ra = radius.nextDouble();
			Circle cir = new Circle(ra);
			System.out.println("The area of Circle is: "+cir.getArea());
			return;
		case "R":
			Scanner size = new Scanner(System.in);
			System.out.println("Enter the width of the Rectangle: ");
			Double wi = size.nextDouble();
			System.out.println("Enter the length of the Rectangle: ");
			Double le = size.nextDouble();
			Rectangle rec = new Rectangle(wi,le);
			System.out.println("The area of Rectangle is: "+rec.getArea());
			return;
		case "T":
			Scanner size1 = new Scanner(System.in);
			System.out.println("Enter the width of the Triangle: ");
			Double base = size1.nextDouble();
			System.out.println("Enter the length of the Rectangle: ");
			Double height = size1.nextDouble();
			Triangle tri = new Triangle(base,height);
			System.out.println(tri.getArea());
			return;
		default:
			System.out.println("No correct input! ");
			return;
		
		}

	}
	
}
