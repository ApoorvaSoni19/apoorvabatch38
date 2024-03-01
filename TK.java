package batch38;
//this keyword program
public class TK 
{
    int age = 33;
    String name;
    double salary;
     void add(int age, String name, double salary) 
     {    
    	 this.age = age;
     }
	public static void main(String[] args)
	{
		TK t1 = new TK();
		t1.add(22,"Apoorva",7899);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);

	}

}
