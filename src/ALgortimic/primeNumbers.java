package ALgortimic;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your last range number");
		int range = sc.nextInt();
		System.out.println("Enter your first range number");
		int no = sc.nextInt();
		IsPrime(range,no);
	
		}
      public static void IsPrime(int range,int no) {
    	  while(no<=range) {
  			int i =2;
  			while(i<=no/2) {
  				if(no%i==0) {
  					break;
  				}i++;
  			}
  			if(i==(no/2+1)) {
  				//System.out.println("Prime numbers are:");
  				System.out.print(no+ " ,");
  			}
  			no++;
  		}
  		
      }
}
