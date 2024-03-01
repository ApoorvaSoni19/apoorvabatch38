package batch38;
class Parent
{
	  void add() 
	   {
		   int a = 400;
		   int b = 600;
		   System.out.println(a+b);
	   }
}

public class MethodOverriding extends Parent
{
   void add() 
   {
	   int a = 100;
	   int b = 200;
	   System.out.println(a+b);
   }
 
	public static void main(String[] args)
	{
		MethodOverriding m1 = new MethodOverriding();
		m1.add();

	}

}
