import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double timep=0.0, length, acceleration;
		System.out.println("Enter length");
		length = in.nextDouble();
		System.out.println("enter acceleration");
		acceleration = in.nextDouble();
		timep = 2*22.0/7.0*Math.sqrt(length/acceleration);
		System.out.println("the time period = "+timep);
		
	}

}
