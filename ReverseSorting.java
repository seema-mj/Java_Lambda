package com.java.reverseSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Employee{
	
	String empName;
	int empNum;
	int salary;
	
	public Employee(int empNum, String empName,int salary) {
		super();
		this.empName = empName;
		this.empNum = empNum;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return empName + ":" + salary;
	}
}

public class ReverseSorting {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(2000,"Seema",40000));
		employeeList.add(new Employee(2005,"Sarika",50000));
		employeeList.add(new Employee(90,"Vikas",90000));
		employeeList.add(new Employee(100,"Ullas",30000));
		//sort by descending order
		Comparator<Employee> c = (e1,e2) -> (e2.salary < e1.salary)?-1:(e2.salary > e1.salary)?1:0;
		Collections.sort(employeeList, c);
		System.out.println(employeeList);
		//second member in the list will be the employee with second highest salary
		System.out.println("employee with second highest salary: " + employeeList.get(1));
		
	}

}
