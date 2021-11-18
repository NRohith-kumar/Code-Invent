package com.tcs.day5;

public class Employee {
	private String employeeName;
	private int employeeID;
	private int age;
	private int salary;
	private String doj;
	private Address address;
	Employee(Address adress)
	{
		this.address = adress;
	}

	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setEmployeeName(String emp)
	{
		this.employeeName = emp;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}

}
