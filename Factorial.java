package batch38;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter factorial number : ");
		int c = s1.nextInt();
		int num = 1 ;
		 int i = 1;
		
		while(i<=c) 
		{
			num = num * i;
			i++;
		}
		
System.out.println("Factorial is " +num);
	}

}
