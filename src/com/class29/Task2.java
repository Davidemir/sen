package com.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a Map that will store Employee name and salary. Write a logic to
		 * retrieve an employee who gets the highest salary. Output should be in the
		 * below format John Smith=$100000
		 */
		Map<String, Double> empMap = new HashMap<>();

		empMap.put("Amit", 100000.00);
		empMap.put("Smita", 1000.00);
		empMap.put("Atena", 120000.00);
		empMap.put("Amit", 65000.00);

		Set<String> empSet = empMap.keySet();

		String MaxEmp_Name = "";
		String Emp_Name;

		double Max_Salary = 0;
		double salary = 0;

		Iterator<String> it = empSet.iterator();

		while (it.hasNext()) {
			Emp_Name = it.next();
			salary = empMap.get(Emp_Name);
			if (salary > Max_Salary) {
				Max_Salary = salary;
				MaxEmp_Name = Emp_Name;
			}
		}
		System.out.println(MaxEmp_Name + "=" + Max_Salary);
	}
}