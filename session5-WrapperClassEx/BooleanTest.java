// Java program to demonstrate parseBoolean() method 
public class BooleanTest 
{ 
	public static void main(String[] args) 
	{ 
		// parsing different Strings 
		boolean b1 = Boolean.parseBoolean("True"); 
		boolean b2 = Boolean.parseBoolean("TruE"); 
		boolean b3 = Boolean.parseBoolean("False"); 
		boolean b4 = Boolean.parseBoolean("FALSE"); 
		boolean b5 = Boolean.parseBoolean("GeeksForGeeks"); 
		
		System.out.println(b1); 
		System.out.println(b2); 
		System.out.println(b3); 
		System.out.println(b4); 
		System.out.println(b5); 
		
	} 
} 
