package com.tcs.day13;
import java.util.*;


public class Application {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Main> playerList = new ArrayList<Main>();
		for (int i=0;i<4;i++) {
		Main obj = Application.createInstance();
		playerList.add(obj);
		}
		System.out.println("Enter Target :");
		int target = sc.nextInt();
		sc.close();
		for(Main i:playerList) {
			int avgRuns = i.getRunsScored()/i.getMatchesPlayed();
			Application.calculateAverage(i.getName(), avgRuns);
		}
	}
public static Main createInstance() {
	Scanner sc = new Scanner(System.in);
	Main m = new Main();
	System.out.println("Enter Name :");
	m.setName(sc.nextLine());
	System.out.println("Enter id : ");
	m.setId(sc.nextInt());
	System.out.println("Enter Exp :");
	m.setExp(sc.nextInt());
	System.out.println("Enter Matches played :");
	m.setMatchesPlayed(sc.nextInt());
	System.out.println("Enter Runs Scored :");
	m.setRunsScored(sc.nextInt());
	
	return m;
}

	public static void calculateAverage(String name,int avgRuns)
	{
		if (80 <= avgRuns && avgRuns <= 100)
		{
			System.out.println(name+" "+"Grade A");
		}
		else if (50 <= avgRuns && avgRuns <= 79)
		{
			System.out.println(name+" "+"Grade B");
		}
		else
		{
			System.out.println(name+" "+"Grade C");
		}
	}
}
