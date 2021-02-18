package com.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	
	String empName;
	int empNumber;
	
	public Employee(int empNumber, String empName) {
		super();
		this.empName = empName;
		this.empNumber = empNumber;
	}

	@Override
	public String toString() {
		return empNumber + ":" + empName;
				
	}
}

public class LambdaSorting {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(2000,"Seema"));
		employeeList.add(new Employee(2005,"Sarika"));
		employeeList.add(new Employee(90,"Vikas"));
		employeeList.add(new Employee(100,"Ullas"));
		System.out.println(employeeList);
		//Lambda exp to sort by employee number
		Collections.sort(employeeList, (e1,e2)-> (e1.empNumber < e2.empNumber)?-1:(e1.empNumber > e2.empNumber)?1:0);
		//Lambda exp to sort by employee name
		Collections.sort(employeeList, (e1,e2) -> (e1.empName.compareTo(e2.empName)));
		System.out.println(employeeList);
		
	}

}
