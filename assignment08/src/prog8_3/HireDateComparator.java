package prog8_3;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Date d1 = o1.getHireDate();
		Date d2 = o2.getHireDate(); 
		
		return d1.compareTo(d2);
	}

}
