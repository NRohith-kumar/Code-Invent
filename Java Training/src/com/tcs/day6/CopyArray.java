package com.tcs.day6;

public class CopyArray {
	public  static void main(String[] args)
	{
		int arr[] = new int[] {1,2,3,4,5};
		int copy[] = new int[5];
		System.out.println("Original array 'arr' is :");
		for(int a:arr)
		{
			System.out.println(a);
		}
		for(int i=0;i<arr.length;i++)
		{
			copy[i] = arr[i];
		}
		System.out.println("Copied array 'copy' is :");
		for (int a:copy)
		{
			System.out.println(a);
		}
		
	}

}
