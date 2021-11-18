package com.tcs.day4;

public class Employee {
	private String employeeName;
	private int employeeID;
	private int age;
	private int salary;
	private String doj;
	static int i;
	Employee()
	{
		i++;
	}
	Employee(String ename,int eID,int esalary,String doj)
	{
		this();
		this.employeeName = ename;
		this.employeeID = eID;
		this.salary = esalary;
		this.doj = doj;
	}
	public static void printEmpAdded() {
		System.out.println("No. of employees added :"+Employee.i);
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
