package com.tcs.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(101,"Ankit",10,01234567));
		list.add(new Student(102,"Aman",11,23156874));
		list.add(new Student(103,"Sumit",10,63524198));
		list.add(new Student(104,"Rahul",10,20136574));
		
		
		System.out.println(list.toString());
		
		//Looping through list to print each element details
		System.out.println("List Before Sorting");
		for(Student i:list)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getAge()+" "+i.getPhoneNumber());
		}
		
		//Sorting the List
//		list.sort((obj1,obj2)->obj1.getName().compareTo(obj2.getName()));
		Collections.sort(list, new StudentComparebyName());
		System.out.println("List after Sorting according to name using comparator interface");
		for(Student i:list)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getAge()+" "+i.getPhoneNumber());
		}
	}
	
}
