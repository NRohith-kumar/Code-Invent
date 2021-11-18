package com.tcs.day6;
import java.util.Scanner;
public class LeftRotate {
	public static void main(String[] args)
	{
		int arr[] = new int[] {1,2,3,4,5};
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of left rotations");
		n = s.nextInt();
		s.close();
		System.out.println("Original array is :");
		for(int i:arr)
		{
			System.out.println(i);
		}
		for (int j=0;j<n;j++) 
		{
			int b=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length - 1]=b;
		}
		System.out.println("Left Rotated array is :");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
