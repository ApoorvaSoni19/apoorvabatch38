package batch38;
  abstract class Nagpur // 1st abstract class
  {
	  abstract void wheather();
	  static void add() 
	  {
		  int a = 10;
		  int b = 20;
		  System.out.println(a+b);
	  }
	  void substraction() 
	  {
		  int a = 30;
		  int b = 20;
		  System.out.println(a-b);
	  }
  }
  abstract class Pune extends Nagpur // 2nd abstract class
  {
	  abstract void wheather_report();
	  static void multiplication() 
	  {
		  int a = 10;
		  int b = 20;
		  System.out.println(a*b);
	  }
	  void division() 
	  {
		  int a = 10;
		  int b = 2;
		  System.out.println(a/b);  
	  }
  }
public class SubClass extends Pune
 {
	  static void One() 
	  {
		  System.out.println("Hi");
	  }
	  void two() 
	  {
		 System.out.println("Bye"); 
	  }
	public static void main(String[] args) 
	{
		SubClass s1 = new SubClass();
		s1.wheather();
		add();
		s1.substraction();
		s1.wheather_report();
		multiplication();
		s1.division();
		One();
		s1.two();

	}
	@Override
	void wheather_report() 
	{
		System.out.println("Nice wheather");
		
	}
	@Override
	void wheather() 
	{
		System.out.println("Wheather is not good");
	}

}
