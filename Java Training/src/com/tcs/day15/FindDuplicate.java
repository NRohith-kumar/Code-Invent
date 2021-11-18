package com.tcs.day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(10);
		list.add(8);
		list.add(9);
		list.add(7);
		list.add(2);
		System.out.println("List is >>> "+list);
		FindDuplicate.getDuplicates(list);
	}
	public static void getDuplicates(List<Integer> l)
	{
		Set<Integer> set = new HashSet<Integer>();
		for (Integer i:l)
		{
			int counter = 0;
			for (Integer j:l)
			{
				if(i == j)
				{
					counter++;
				}
			}
			if(counter > 1)
			{
				set.add(i);
			}
		}
		System.out.println("Duplicate Elements are >>> "+set);
	}
}
