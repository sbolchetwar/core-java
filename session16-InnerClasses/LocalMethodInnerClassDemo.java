class Outer { 
	void outerMethod() { 
		System.out.println("inside outerMethod"); 
		// Inner class is local to outerMethod() 
		class Inner { 
			void innerMethod() { 
				System.out.println("inside innerMethod"); 
			} 
		} 
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
} 
class LocalMethodInnerClassDemo { 
	public static void main(String[] args) { 
		Outer x = new Outer(); 
		x.outerMethod(); 
	} 
} 
