package Prog1_Day2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Marketing> ma = new ArrayList();
		ma.add(new Marketing("Ha","Iphone",200));
		ma.add(new Marketing("Yen","Iphone",500));
		System.out.println(ma);
		ma.remove(1);
		System.out.println(ma);
		ma.set(0, new Marketing("Navi","Iphone",300));

		Marketing x = new Marketing("AA", "Samsung", 1000);
		Marketing y = new Marketing("BB", "Sony", 1300);
		
		System.out.println(ma.size());
		
		MarketingComparator maCom = new MarketingComparator();
		
		
		System.out.println(maCom.compare(x, y));
		//Marketing[] a = new Marketing[1];
		

	}

}
