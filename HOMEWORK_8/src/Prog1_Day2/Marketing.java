package Prog1_Day2;

import java.util.ArrayList;
import java.util.Comparator;

public class Marketing{

	String emp;
	String product;
	double sale;

	public Marketing(String emp, String product, double sale) {
		this.emp = emp;
		this.product = product;
		this.sale = sale;
	}
	
	public String getEmp() {
		return emp;
	}

	public String getProduct() {
		return product;
	}

	public double getSale() {
		return sale;
	}

	@Override
	public String toString() {
		return emp + " , " + product + " , " + sale;
	}
	
}
