package com.tcs.day12;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcurrent extends Thread{
	static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();
	public void run()
	{
		
		map.put(4, "Machine Tools");
		map.put(5, "Finite Element Methods");
		map.put(6, "Machine Drawing");
		map.put(7, "Finite Element Methods");
		
	}
	public static void main(String[] args)
	{
		
		map.put(1,"Thermodynamics");
		map.put(2,"Fluid Mechanics");
		map.put(3,"Thermal Engineering");
		
		HashMapConcurrent m = new HashMapConcurrent();
		m.start();
		for(Object i : map.entrySet())
		{
			Object obj = i;
			System.out.println(obj);
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
	}

}

