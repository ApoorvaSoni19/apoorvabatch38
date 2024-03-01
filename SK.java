package batch38;
//Super keyword program
class Parent1
{
	void add() 
	{
		
		int a = 400;
		int b = 300;
		System.out.println(a+b);
		
	}
}
public class SK extends Parent1
{
	void add() 
	{
		
		int a = 100;
		int b = 200;
		System.out.println(a+b);
		super.add();
	}
	public static void main(String[] args) {
         SK s1 = new SK();
		s1.add();
	}

}
