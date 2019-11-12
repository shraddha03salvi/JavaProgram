package Programs;

import java.util.Scanner;

public class harmonic {

	public static void Harmonic() {
		String s = "";
		int harmonic = 1;
		double harmonicNum = 1;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Nth value");
		int n = sc.nextInt();
		if (n != 0) {
			System.out.print("1+");
			for (i = 2; i <= n; i++) { // For series Printing
				s += "1/" + i + "+";
				// For series addition
				harmonicNum += 1.0 / i;

			}
			StringBuffer str = new StringBuffer(s);
			str.deleteCharAt(str.length() - 1);
			System.out.println(str);
			System.out.println(harmonicNum);

		} else {
			System.out.println("invalid number");
		}
	}

	public static void main(String[] args) {
		Harmonic();

	}

}
