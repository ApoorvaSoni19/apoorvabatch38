package batch38;
//this calling statement program
public class TCS 
{
      TCS()
      {
    	  this("Apoorva");// this is "this calling statement"
       System.out.println("Constructor one with no parameter");	  
      }
      TCS(String a)
      {
       System.out.println("Constructor two with paramenter");	  
      }
	public static void main(String[] args)
	{
		new TCS();

	}

}
