package prog8_3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override 
	public int compare(Employee o1, Employee o2) {
		double sal_1 = o1.getSalary();
		double sal_2 = o2.getSalary();
		
		//now name1 equals name2 and hireDate1 equals hireDate2
        if(sal_1 < sal_2) {
			return -1;
		}
		else if(sal_1 > sal_2) {
			return 1;
		}
		else {
			return 0;
		} 
	} 
 

}
