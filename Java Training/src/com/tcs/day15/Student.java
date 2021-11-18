package com.tcs.day15;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	private long phoneNumber;
	
	Student(int id, String name,int age,long phoneNumber)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	public int getId()
	{
		return this.id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name)
				&& phoneNumber == other.phoneNumber;
	}

	@Override
	public int compareTo(Student o) {
		//Comparable interface compareTo() used by TreeMap for default sorting
		// First checking name if equal ordering w.r.to age else continuing to order by name.
		if(name == o.getName())
		{
			if (age == o.getAge())
			{
				return 0;
			}
			else if(age > o.getAge())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else 
		{
			return name.compareTo(o.getName());
		}
		
	}

}

