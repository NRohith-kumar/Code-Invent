package com.tcs.day4;

public class Application {
	static
	{
		System.out.println("Welcome to TCS");
	}
	public static void main(String[] args)
	{
		Display d = new Display();
		Employee e1 = new Employee("Suresh",12345,20000,"1995-10-01");
		d.displayDetails(e1);
		Utility.calculateAge(e1,"1962-01-10");
		Employee e2 = new Employee("Ram",67890,30000,"2000-10-01");
		d.displayDetails(e2);
		Utility.calculateAge(e2,"1981-05-10");
		Employee e3 = new Employee("Rahul",8765,40000,"2005-08-01"); 
		d.displayDetails(e3);
		Utility.calculateAge(e3,"1990-12-01");
		Employee.printEmpAdded();
	}
}
