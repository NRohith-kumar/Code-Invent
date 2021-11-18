package com.tcs.day5;

public class Application {
	public static void main(String[] args)
	{
		
		Address adress = new Address();
		adress.setCity("Hyderabad");
		adress.setCountry("India");
		adress.setHno("12-23/A");
		adress.setState("Telangana");
		adress.setZipcode(123456);
		
		Employee emp = new Employee(adress);
		emp.setAge(33);
		emp.setDoj("01-10-2021");
		emp.setEmployeeID(1001);
		emp.setEmployeeName("Ramesh");
		emp.setSalary(200000);
		
	
		System.out.println("Employee Details : ");
		
		System.out.println("EmployeeName : "+emp.getEmployeeName());
		System.out.println("EmployeeID : "+emp.getEmployeeID());
		System.out.println("Doj : "+emp.getDoj());
		System.out.println("Age : "+emp.getAge());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("");
		
		
		System.out.println("Address Details : ");
		
		System.out.println("House No :"+emp.getAddress().getHno());
		System.out.println("ZipCode : "+emp.getAddress().getZipcode());
		System.out.println("City : "+emp.getAddress().getCity());
		System.out.println("State : "+emp.getAddress().getState());
		System.out.println("Country : "+emp.getAddress().getCountry());
	
	}
}
