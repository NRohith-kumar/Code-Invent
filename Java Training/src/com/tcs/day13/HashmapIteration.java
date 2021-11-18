package com.tcs.day13;
import java.util.*;
import java.util.Map.Entry;

public class HashmapIteration {
	public static void main(String[] args)
	{
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		//Adding key,values to the hashmap
		hashMap.put(101301, "IS Department");
		hashMap.put(101302,"Change Request");
		hashMap.put(101303,"Hardware Issue");
		hashMap.put(101304,"Trouble in Login");
		
		//Printing the hashMap
		System.out.println(hashMap);
		
		//using iterator to loop through hashMap and print key values from entry set
		Iterator<Entry<Integer, String>> iter = hashMap.entrySet().iterator();
		System.out.println("****Printing EntrySet elements****");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		//Using iterator to loop through hashMap by using keyset and printing values
		Iterator<Integer> iter1 = hashMap.keySet().iterator();
		System.out.println("****Printing values using Keyset****");
		while(iter1.hasNext())
		{
			System.out.println(hashMap.get(iter1.next().intValue()));
		}
		

		//Trying to use foreach loop and printing values using values()
		System.out.println("****Printing values using values()****");
		for(Object i:hashMap.values())
		{
			System.out.println(i);
		}
	}
}
