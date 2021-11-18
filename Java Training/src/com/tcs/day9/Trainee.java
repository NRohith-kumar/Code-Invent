package com.tcs.day9;
import java.util.*;
public class Trainee {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args)
	{
	
		Trainee trainee1 = new Trainee();
		trainee1.setName("Krishna");
		trainee1.setAge(22);
		Trainee trainee2 = new Trainee();
		trainee2.setName("Merry");
		trainee2.setAge(21);
		Trainee trainee3 = new Trainee();
		trainee3.setName("Ashwin");
		trainee3.setAge(23);
		Trainee trainee4 = new Trainee();
		trainee4.setName("Bala");
		trainee4.setAge(20);
		Trainee trainee5 = new Trainee();
		trainee5.setName("Krishna");
		trainee5.setAge(22);

		List<Trainee> trainee = new ArrayList<Trainee>();
		trainee.add(trainee1);
		trainee.add(trainee2);
		trainee.add(trainee3);
		trainee.add(trainee4);
	
		for(Trainee i:trainee)
		{
			System.out.println(i.getName());
		}
		
		System.out.println();
		trainee.add(trainee5);
		System.out.println("After adding trainee5 >>>");
		System.out.println("trainee.contains(trainee5) >>>>"+trainee.contains(trainee5));
		System.out.println("trainee1.equals(trainee5) >>>>"+trainee1.equals(trainee5));
	}

}
