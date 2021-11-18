package com.tcs.day4;

import java.time.*;
public class Utility {
	
	
	static void calculateAge(Employee emp,String dob)
	{
		
		LocalDate d1 = LocalDate.parse(dob);
		LocalDate d2 = LocalDate.parse(emp.getDoj());
		Period p = d1.until(d2);
		int years = p.getYears();
		System.out.println("Age of the employee is "+years+" years");
	}

}
