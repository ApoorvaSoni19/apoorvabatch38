package batch38;

import java.util.Scanner;

public class Assignment27 
{ 
	void add() 
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter no1 value:");
		int no1 = s1.nextInt();
		System.out.println("Enter no2 value:");
		int no2 = s1.nextInt();
		System.out.println(no1+no2);
	}
	void substract() 
	{
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter no3 value:");
		int no3 = s2.nextInt();
		System.out.println("Enter no4 value:");
		int no4 = s2.nextInt();
		System.out.println(no3-no4);
	}
	void multiplication() 
	{
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter no5 value:");
		int no5 = s3.nextInt();
		System.out.println("Enter no6 value:");
		int no6 = s3.nextInt();
		System.out.println(no5+no6);
	}
	void division() 
	{
		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter no7 value:");
		int no7 = s4.nextInt();
		System.out.println("Enter no8 value:");
		int no8 = s4.nextInt();
		System.out.println(no7/no8);
	}

	public static void main(String[] args) 
	{
		Assignment27 a1 = new Assignment27();
		a1.add();
		a1.substract();
		a1.multiplication();
		a1.division();

	}
    

}
