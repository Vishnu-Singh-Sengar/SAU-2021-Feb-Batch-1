package com.Hibernate.Hib1;

import java.util.Scanner;

public class OutputMenu {
	Scanner sch = new Scanner(System.in);
	public void printList() {
		System.out.println("Enter Choices:\n1- Add Employee\n2- Update Employee\n3- Delete Employee\n4- Get All Employee\n5- Get Employee by ID\n6- Exit ");
	}
	public void printChoice(){
		
		System.out.println("Enter Attribute to update:\n1- ID\n2-First Name\n3- Last Name\n4- DOB\n5- Designation\n6- Salary\n7- Age");
	}
	public Employee entChoice() {
		Employee e=new Employee();
		try {
		System.out.println("Give Details of New Employee");
		
		System.out.println("Enter First Name");
		e.setFname(sch.nextLine());
		
		System.out.println("Enter Last Name");
		e.setLname(sch.nextLine());
		
		System.out.println("Enter Designation");
		e.setDesignation(sch.nextLine());
		
		System.out.println("Enter Date of Birth");
		e.setDob(sch.nextLine());
		
		System.out.println("Enter Salary");
		e.setSalary(sch.nextInt());
		
		System.out.println("Enter ID");
		e.setId(sch.nextInt());
		
		System.out.println("Enter Age");
		int num=sch.nextInt();
		System.out.println(num);
		sch.nextLine();
		int temp=num;
		
		int count=0;
		for(; num != 0; num/=10, ++count);
		if (count>2) {
			throw new ArithmeticException("Age Limit Exceeded");
		}
		else
		{
			e.setAge(temp);
		}
	}
	catch (Exception e1) {
		System.out.println("Entered age is greater than 99");
	}
		return e;
	}

}
