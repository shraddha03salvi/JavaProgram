package Programs;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a, b and c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c= sc.nextDouble();
		double delta = (b*b-4*a*c);
		double x1 = (-b+Math.sqrt(delta))/(2*a);
		double x2 = (-b-Math.sqrt(delta))/(2*a);
		System.out.println("first root x1 = "+x1);
		System.out.println("second root x2 = "+x2);

	}

}
