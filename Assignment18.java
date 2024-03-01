package batch38;

public class Assignment18 {

	public static void main(String[] args) 
	{
		int a = 786;
		int b = 500;
		if (a>b||a<b) 
		{
			System.out.println("Rules of success");
			if (a<=b||a>=b)
            {
			System.out.println("Discipline");
			   if(a!=500||b!=786)
			   {
				   System.out.println("Consistency");
				   if(a==500||b==786) 
				   {
					   System.out.println("Hard work");
				   }
				   else 
				   {
					   System.out.println("Pass");
				   }
			   }
			   else
			   {
				   System.out.println("No consistency");
			   }
			}
            else {
            	System.out.println("No discipline");
            }
		}
		else
		{
			System.out.println("mantra");
		}
	}

}
