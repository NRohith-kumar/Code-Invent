package com.tcs.day15;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass{
	public static void main(String[] args)
	{
		Map<Student, String> map = new TreeMap<Student,String>();
		Student s = new Student(101,"Ankit",10,01234567);
		Student s1 = new Student(102,"Aman",11,23156874);
		Student s2 = new Student(103,"Sumit",9,63524198);
		Student s3 = new Student(104,"Rahul",21,20136574);
		Student s4 = new Student(105,"Rahul",20,10252997);
		System.out.println("Using TreeMap");
		map.put(s,"CSE");
		map.put(s1,"AUTOMOBILE");
		map.put(s2,"ECE");
		map.put(s3,"CIVIL");
		map.put(s4, "MECHANICAL");
		
		for(Map.Entry<Student,String> i:map.entrySet())
		{
			System.out.println(i);
		}
		System.out.println();
		Map<Student,String> hmap = new HashMap<Student,String>();
		System.out.println("Using HashMap");
		hmap.put(s,"CSE");
		hmap.put(s1,"AUTOMOBILE");
		hmap.put(s2,"ECE");
		hmap.put(s3,"CIVIL");
		hmap.put(s4, "MECHANICAL");
		
		for(Map.Entry<Student,String> i:hmap.entrySet())
		{
			System.out.println(i);
		}
		System.out.println();
		
		//hmap is passed to the constructor of treemap inorder to copy hashmap to treemap.We can also use putall() to do the same.
		System.out.println("Sorting hashmap with the help of treemap");
		TreeMap<Student,String> tmap = new TreeMap<Student,String>(hmap);
		for(Map.Entry<Student,String> i : tmap.entrySet())
		{
			System.out.println(i);
		}
	}

	
}
