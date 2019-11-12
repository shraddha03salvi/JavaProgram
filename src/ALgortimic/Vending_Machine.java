package ALgortimic;

import java.util.Scanner;

public class Vending_Machine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an amount you want to dispense: ");
		int amount = sc.nextInt();
		vendingMachine(amount);

	}
   public static void vendingMachine(int amount) {
	   int count = 0;
      //int choice = 1;
       int[] arr = {1000, 500, 100, 50, 10, 5, 2, 1};
       for (int i = 0; i < arr.length; i++) {
           if (amount / arr[i] >= 1) //case1 to print 1000 notes
           {
               double result = Math.floor(amount / arr[i]);
               System.out.println("Number of "  + arr[i] + " rs note are : " + result);
               amount = (int) (amount - result * arr[i]);
              count = (int) (count + result);
           }
       }
     
   }
}
