package com.tcs.day15;

import java.util.Comparator;

public class NestedCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getName()==o2.getName())
		{
			if (o1.getAge() == o2.getAge())
			{
				return 0;
			}
			else if(o1.getAge() > o2.getAge())
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
			return o1.getName().compareTo(o2.getName());
		}
	}

}
