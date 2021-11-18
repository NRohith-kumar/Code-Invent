package com.tcs.day10;

public class UnCheckedException {
	public static void main(String[] args)
	{
		int[] arr = new int[] {0,1,2,3};
		int j = arr.length;
		
		try
		{
			
			arr[j] = 10;
			System.out.println(arr[j]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception is >>>>  "+e);
			System.out.println();
		}
		finally
		{
			System.out.println("In FINALLY Block");
			j--;
			System.out.println("arr[j] >>>> "+arr[j]);
		}
	}

}
