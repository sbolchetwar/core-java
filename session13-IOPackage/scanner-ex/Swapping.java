import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.println("enter 2 numbers");
		a = in.nextInt();
		b = in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a ="+a);
		System.out.println("value of b = "+b);
	}

}
