package com.tcs.day7;
abstract class Student{
	abstract void study();
}
interface Employee{
	abstract void work();
}
public class Anonymous {
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD");
		Student s = new Student() //Extending abstract class Student
				{
			public void study()
			{
				System.out.println("Studying.....");
			}
				};
		s.study();
		
		
		Employee e = new Employee()
				{

					@Override
					public void work() {
						// TODO Auto-generated method stub
						System.out.println("Employee is working...");
					}
			
				};
		e.work();
		System.out.println(new Runnable() {public void run () {}});
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}};
		System.out.println(r);
		r.run();
	}

	
}
