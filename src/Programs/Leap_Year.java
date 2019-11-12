package Programs;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year for checking its leap year or not");
		int year = sc.nextInt();
		boolean flag = false;
		if(year%400 ==0 && (year%100 !=0) || year%4==0) 
		{
			flag = true;
			System.out.println("Entered year is leap year" +year);
		}
		else {
		
		flag = false;
		System.out.println("Entered year is not leap year" +year);
		}
		sc.close();
	}

}
