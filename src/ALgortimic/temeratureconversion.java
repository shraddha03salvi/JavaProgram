package ALgortimic;

import java.util.Scanner;

public class temeratureconversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice for conversion:   \n 1.Fahrenheit to Celsius   \n 2.Celsius to Fahrenheit");
		int ch = sc.nextInt();
		switch(ch) 
		{
		case 1:
        	System.out.println("enter fahrenheit temprature");
        	float f = sc.nextFloat();
        	float tempCal = ((f - 32) * 5/9);
        	System.out.println("Celsius temprature is "+tempCal);
        	break;
        case 2:
        	System.out.println("enter Celsius temprature");
        	float c = sc.nextFloat();
        	float tempFah = ((c*9/5) + 32);
        	System.out.println("fahrenheit temprature is "+tempFah);
        	break;
        default:
        	System.out.println("choose valid choice ");
		
		}
	}

}
