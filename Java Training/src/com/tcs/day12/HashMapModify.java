package com.tcs.day12;
import java.util.*;

public class HashMapModify extends Thread{
	static Map<Integer,String> map = new HashMap<Integer,String>();
	public void run()
	{
		map.put(4, "Finite Element Methods");
		
	}
	public static void main(String[] args)
	{
		
		map.put(1,"Thermodynamics");
		map.put(2,"Fluid Mechanics");
		map.put(3,"Thermal Engineering");
		
		HashMapModify m = new HashMapModify();
		m.start();
		//Throws ConcurrentModificationException 
		for(Object i : map.entrySet())
		{
			System.out.println(i);
		}
		
	}

}

