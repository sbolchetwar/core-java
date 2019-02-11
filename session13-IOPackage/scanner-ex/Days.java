import java.util.Scanner;

public class Days {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a,d,m,y,b;
		System.out.println("Enter the no of days");
		a = in.nextInt();
		y = a / 365;
		b = a%365;
		m=b/30;
		d=b%30;
		System.out.println("No of years = "+y);
		System.out.println("No of months = "+m);
		System.out.println("No of Days = "+d);
	}

}
