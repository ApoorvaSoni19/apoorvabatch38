package batch38;

public class Assignment25 
{
	
	static 
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Instance Initiate Block");
	}
	Assignment25()
	{
		System.out.println("Constrcutor without parameter");
	}

	public static void main(String[] args) 
	{
		Assignment25 a1 = new Assignment25();
		Assignment25 a2 = new Assignment25();
	}

}
