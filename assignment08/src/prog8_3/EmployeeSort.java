package prog8_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
	
	static SORT _sort; 
	
	public static void main(String[] args) {
		new EmployeeSort(SORT.BY_NAME);

	}
	public EmployeeSort(SORT opt) 
	{
		_sort = opt;
		
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);
 
		
		if(_sort == SORT.BY_HIRE_DATE)
		{
			Collections.sort(empList, new HireDateComparator());
		}
		else if(_sort == SORT.BY_NAME) 
		{
			Collections.sort(empList, new  NameComparator());
		}
		else if(_sort == _sort.BY_SALARY) 
		{
			Collections.sort(empList, new SalaryComparator());
		}
		
		System.out.println(empList);
		
	}

}
