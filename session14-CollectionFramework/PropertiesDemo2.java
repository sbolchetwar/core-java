// Java code illustrating list() method 
import java.util.*; 
class PropertiesDemo2 
{ 
	public static void main(String arg[]) 
	{ 
		Properties gfg = new Properties(); 
		Set URL; 
		String str; 
		
		gfg.put("ide", "ide.geeksforgeeks.org"); 
		gfg.put("contribute", "contribute.geeksforgeeks.org"); 
		gfg.put("quiz", "quiz.geeksforgeeks.org"); 
		
		gfg.list(System.out); 
	} 
} 
