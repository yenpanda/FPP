/* RESULT
[Ha , Iphone , 20000.0, AAA , Sony , 1000.0, Yen , Iphone , 500.0]
[Ha , Iphone , 20000.0, Yen , Iphone , 500.0]
[Navi , Iphone , 3000.0, Yen , Iphone , 500.0]
ArrayList size: 2
Marketing Comparator: 1
List of Sale more than 1000: [Navi , Iphone , 3000.0]
 */
package Prog1_Day2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Marketing> ma = new ArrayList();
		ma.add(new Marketing("Ha","Iphone",20000));
		ma.add(new Marketing("AAA","Sony",1000));
		ma.add(new Marketing("Yen","Iphone",500));
		System.out.println(ma);
		ma.remove(1);
		System.out.println(ma);
		ma.set(0, new Marketing("Navi","Iphone",3000));
		System.out.println(ma);

		Marketing x = new Marketing("AA", "Samsung", 1000);
		Marketing y = new Marketing("BB", "Sony", 1300);
		
		System.out.println("ArrayList size: "+ ma.size());
		
		MarketingComparator maCom = new MarketingComparator();
		System.out.println("Marketing Comparator: " + maCom.compare(x, y));
		
		ArrayList<Marketing> test = list1000(ma);
		System.out.println("List of Sale more than 1000: " + test);

	}
	
	public static ArrayList<Marketing> list1000(ArrayList<Marketing> list){
		ArrayList<Marketing> tmp = new ArrayList<Marketing>();
		for(Marketing a :list){
			if(a.getSale() >= 1000)
				tmp.add(a);
		}
		return tmp;
	}

}
