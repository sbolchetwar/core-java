class Outer { 
private static void outerMethod() { 
	System.out.println("inside outerMethod"); 
} 
	
// A static inner class 
static class StaticInnerClassDemo { 
	public static void main(String[] args) { 
		System.out.println("inside inner class Method"); 
		outerMethod(); 
	} 
} 

}
