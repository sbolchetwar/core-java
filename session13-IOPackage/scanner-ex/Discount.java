import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double pp,dp=0.0,tp=0.0;
		System.out.println("enter price ");
		pp=in.nextDouble();
		dp = pp - (10.0/100*pp);
		tp = dp + (6.0 / 100*dp);
		System.out.println("total amount = "+tp);
		System.out.println("dp = "+dp);

	}

}
