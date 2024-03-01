package batch38;

// Abstact class program
abstract class Country 
{
	abstract void maninsh_nagar();//This is abstract method
}
public class City extends Country
   {

	public static void main(String[] args) 
	{
		
       City c1 = new City ();
       c1.maninsh_nagar();
	}

	@Override
	void maninsh_nagar() // This is concrete method
	{
		System.out.println("Nice area location");
		
	}

}
