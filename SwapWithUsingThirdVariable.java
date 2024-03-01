package batch38;

public class SwapWithUsingThirdVariable {

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 500;
		int c;
		
		c=a;
		a=b;// a becomes 500
		b=c;// b becomes 100
		System.out.println("value of a is : " +a);
		System.out.println("value of b is : " +b);
		
		
	}

}
