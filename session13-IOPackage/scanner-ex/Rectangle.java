import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double l,w,d,area=0.0,perimeter=0.0;
		System.out.println("enter the width of rectangle");
		w = in.nextDouble();
		System.out.println("enter the diagonal of rectangle");
		d = in.nextDouble();
		l = Math.sqrt(d*d-w*w);
		area=l*w;
		perimeter=2*(l+w);
		System.out.println("the area = "+area);
		System.out.println("peri = "+perimeter);
	}

}
