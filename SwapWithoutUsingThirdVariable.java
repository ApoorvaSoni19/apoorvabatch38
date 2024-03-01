package batch38;

public class SwapWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a = 200;
		int b = 100;
		
		a = a+b;// a becomes 300
		b = a-b;// b becomes 200
		a = a-b; // a becomes 100
		System.out.println("Value of a is : " +a );
		System.out.println("Value of b is : " +b );
	}

}
