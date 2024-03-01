package batch38;
//Super calling statement program. Definition: super calling statement is used to call parent class constructor from child class constructor
class Parentclass
{
	Parentclass(int a)
	{
		 
	  System.out.println("Parent class constructor");	
	 
	}
	
}
public class SCS extends Parentclass
{
	SCS()
	{   super(10);//Super calling statement is written here in explicit way
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		
		new SCS();
		
	}

}
