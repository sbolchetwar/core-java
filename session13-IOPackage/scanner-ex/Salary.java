import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double salary, New_Salary=0.0;
		System.out.println("Enter the salary of the employee");
		salary = in.nextDouble();
		New_Salary = salary+(15/100*salary);
		System.out.println("the new slaary of the employees = "+New_Salary);
	}

}
