package ALgortimic;

import java.util.Scanner;

public class Palindrome extends primeNumbers{

	public static void main(String[] args) 
	{
		int rem, rev=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome or not");
		int num = sc.nextInt();
		int temp= num;
		while(temp!=0) {
			rem= temp%10;
			rev=(rev*10) + rem;
			temp= temp/10;
		}if(rev==num) {
			System.out.println("Entered number is palindrome");
		}else {
			System.out.println("Entered number is not palindrome");
		}
	}

}
