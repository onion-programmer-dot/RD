package com.rd.interview.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThreeHighestEaringEmployee {

	public static void main(String[] args) {
		// Created employee list
		List<Employee> list = new ArrayList<>();
		
		// Adding employee object into list
		list.add(new Employee(1, "A", 20000));
		list.add(new Employee(2, "B", 12000));
		list.add(new Employee(3, "C", 15000));
		list.add(new Employee(4, "D", 18000));
		list.add(new Employee(5, "E", 11000));
		
		
		//find out the top three highest salary employee
		
		// copy from original list
		List<Employee> listcopy = new ArrayList<>(list);
		
		// sort the employee
		listcopy.sort((o1, o2) -> o2.getSalary() - o1.getSalary());
		
		// get max three employee
		for (int i = 0; i < 3; i++) {
			System.out.print(listcopy.get(i).getName() + "\t");
			System.out.print(listcopy.get(i).getSalary());
			
			System.out.println();
		}
		
		// get three highest employee by stream api
		
		list.stream().sorted(Comparator.comparingInt(Employee :: getSalary).reversed())
		.limit(3)
		.map(Employee :: getName)
		.forEach(System.out::println);
		
	}

}
