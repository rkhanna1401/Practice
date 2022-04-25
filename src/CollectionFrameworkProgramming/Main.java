package CollectionFrameworkProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Rishi",32));
		list.add(new Employee("Bhavana",30));
		SalaryComparator age = new SalaryComparator();
		Collections.sort(list,age);
		
		for(Employee e : list) {
			System.out.println("Name: "+e.getName() + "  Salary: " + e.getSalary());
		}
	}

}
