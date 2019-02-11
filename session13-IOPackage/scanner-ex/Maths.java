import java.util.Scanner;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b,sum =0;
		double average = 0.0;
		System.out.println("Enter two numbers");
		a = in.nextInt();
		b = in.nextInt();
		sum = a+b;
		average = sum/2.0;
		System.out.println("The sum = "+sum);
		System.out.println("The average = "+average);

	}

}
