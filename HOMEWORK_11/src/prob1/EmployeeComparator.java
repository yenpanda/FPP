package prob1;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSsn().compareTo(o2.getSsn())!= 0)
			return o1.getSsn().compareTo(o2.getSsn());
		return 0;
	}

}
