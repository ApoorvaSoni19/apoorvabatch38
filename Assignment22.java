package batch38;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<=500; i++) 
		{
			System.out.println(i);
			
		}
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = s1.nextInt();
		if(number%3==0) 
		{
			System.out.println("Computer");
		}
		if(number%5==0) 
		{
			System.out.println("Mouse");
		}
		

	}

}
