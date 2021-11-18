package com.tcs.day14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Application {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<Details> l= new ArrayList<Details>();
		for(int i=0;i<4;i++)
		{
			Details obj = Application.createObject();
			l.add(obj);
			
		}
		System.out.println("Enter Illness Name key to sort by cost >>>");
		String key = sc.nextLine();
		Collections.sort(l);
		
		for(Details i:l)
		{
			if (key.equalsIgnoreCase(i.getDisease()))
			{
				System.out.println(i.getCost());
			}
		}
		sc.close();
	}
	public static Details createObject()
	{
		Scanner s = new Scanner(System.in);
		Details d = new Details();
		System.out.println("Enter Medicine Name >>> ");
		d.setName(s.nextLine());
		System.out.println("Enter Batch >>>");
		d.setBatch(s.nextLine());
		System.out.println("Enter Illness Cures>>>");
		d.setDisease(s.nextLine());
		System.out.println("Enter Cost >>>");
		d.setCost(s.nextInt());
		
		return d;
	}
	
	
	
}
