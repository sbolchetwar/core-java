import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double diagonal, s, area=0.0, perimeter=0.0;
		System.out.println("Enter the diagonal");
		diagonal = in.nextDouble();
		s = diagonal / Math.sqrt(2);
		area = s*s;
		perimeter = 4*s;
		System.out.println("The area of Sqare = "+area);
		System.out.println("The perimeter of Sqare = "+perimeter);

	}

}
