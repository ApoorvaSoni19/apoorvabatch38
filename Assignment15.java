package batch38;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) 
	{
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter positive no: ");
		int no1 = s1.nextInt();
		if (no1 > 0) 
		{
			System.out.println("This is positive number");
		}
		else
		{
			System.out.println("This is negative number");
		}

	}

}
