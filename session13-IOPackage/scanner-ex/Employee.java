import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int basicpay;
		double gp =0.0,np=0.0,da,hra,pf;
		System.out.println("Enter basic salary");
		basicpay=in.nextInt();
		da = (30.0/100)*basicpay;
		hra = (15.0/100)*basicpay;
		pf = (12.5/100)*basicpay;
		gp = basicpay+da+hra;
		np = gp-pf;
		System.out.println("gross = "+gp);
		System.out.println("netpay = "+np);
		System.out.println("da = "+da);
		System.out.println("hra = "+hra);
		System.out.println("pf = "+pf);

	}

}
