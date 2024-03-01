package batch38;

public class StrFunctions {

	public static void main(String[] args) 
	{
		String no1 = "My name is Apoorva";
		String no2 = "  Soni  ";
		 String no3 = no1.concat(" ").concat(no2);
		 System.out.println(no3);

		System.out.println(no1.toUpperCase());
		System.out.println(no1.toLowerCase());
		System.out.println(no1.trim());
		System.out.println(no2.charAt(1));
		System.out.println(no2.indexOf('i'));
		System.out.println(no1.length());
		System.out.println(no1.substring(0));
		System.out.println(no1.substring(3));
		System.out.println(no1.substring(1, 5));
		System.out.println(no2.endsWith("i"));
		System.out.println(no2.trim());
		System.out.println(no2.charAt(0));
	}

}
