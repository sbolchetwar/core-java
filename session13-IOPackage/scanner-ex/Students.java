import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n, m, b;
		double percb,percg;
		System.out.println("Enter taoal no of students ");
		n = in.nextInt();
		System.out.println("Enter taoal no of girls ");
		m = in.nextInt();
		b = n-m;
		percb = (double)b/n * 100;
		percg = (double)m/n * 100;
		System.out.println("percentage of girls = "+percg);
		System.out.println("percentage of boys = "+percb);
		
	}

}
