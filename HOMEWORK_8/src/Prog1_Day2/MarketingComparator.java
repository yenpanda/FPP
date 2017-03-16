package Prog1_Day2;

import java.util.Comparator;

public class MarketingComparator implements Comparator<Marketing>{
	
	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub
		if(o1.getSale() < o2.getSale())
			return 1;
		else if(o1.getSale() < o2.getSale())
			return -1;
		else if (o1.getSale() == o2.getSale()){
			if(o1.getEmp().compareTo(o2.getEmp())!=0)
				return o1.getEmp().compareTo(o2.getEmp());	
			else 
				return o1.getProduct().compareTo(o2.getProduct());
		}
		return 0;
	}

}
