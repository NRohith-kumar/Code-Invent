package com.tcs.day9;
import java.util.*;

public class Hash {
	public static void main(String[] args)
	{
		
		Map<String,List<String>> map = new HashMap<String,List<String>>();	
		List<String> trainees = new ArrayList <String>();
		List<String> trainees1 = new ArrayList <String>();
		List<String> trainees2 = new ArrayList <String>();
		List<String> trainees3 = new ArrayList <String>();
		trainees.add("Pramila");
		trainees.add("John");
		map.put("Pramod",trainees);
		
		trainees1.add("Geeta");
		trainees1.add("Seeta");
		map.put("Kiran",trainees1);
	
		trainees2.add("Deepak");
		trainees2.add("Amol");
		trainees2.add("Tushar");
		map.put("Jyoti", trainees2);
		
		trainees3.add("Ratan");
		trainees3.add("Kripal");
		map.put("Abhi", trainees3);
		
		System.out.println("Pramod >>>"+map.get("Pramod"));
		System.out.println("Kiran  >>>"+map.get("Kiran"));
		System.out.println("Jyothi  >>>"+map.get("Jyoti"));
		System.out.println("Abhi  >>>"+map.get("Abhi"));
	}
}
