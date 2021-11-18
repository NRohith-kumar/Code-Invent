package com.tcs.day10;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class CheckedException {
	public static void main(String[] args)
	{
		File f = new File("Random name.txt");
		
		try
		{
			FileInputStream s = new FileInputStream(f);
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("Exception is >>>> "+exception.getMessage());
			System.out.println();
		}
		finally
		{
			System.out.println("In FINALLY Block");
		}
	}
}