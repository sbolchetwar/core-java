
public class Calculation {
	public static void main(int a,int b, int c, int d) {
		int sum = 0; double average = 0.0;
		sum = a+b+c+d;
		average = sum/4.0;
		System.out.println("The sum = "+sum);
		System.out.println("The average = "+average);
	}
	public static void main(String args[]) {
		main(1,2,3,4);
	}
}
