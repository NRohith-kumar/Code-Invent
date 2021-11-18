package com.tcs.day9;
import  java.util.*;
public class Actors {
	public static void main(String[] args) {
	List<String> actors = new ArrayList<String>(){
	{
		add("Anthony");
		add("Amar");
		add("Akbar");
		add("Rajni");
		add("Akshay");
		add("Saif");
		add("Kareena");
		add("Vijay");
		add("NTR");
		add("SRK");
		add("Hanks");
		add("Will");
	}
	};
	
	System.out.println("Sorted actors arrayList >>>");
	Collections.sort(actors);
	for (String i : actors)
	{
		System.out.println(i);
	}
	
	System.out.println();
	
	System.out.println("Reverse sorted actors arrayList >>>");
	Collections.sort(actors,Collections.reverseOrder());
	for (String i : actors)
	{
		System.out.println(i);
	}
	
}
}