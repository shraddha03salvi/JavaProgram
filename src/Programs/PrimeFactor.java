package Programs;

import java.util.Scanner;

public class PrimeFactor {
    public static void primefactor(int n) {
    	
    	for(int i=2;i*i<=n;i++)
    	{
    		while(n%i==0) {
    			System.out.println(i+" ");
	            n /= i;
    		}
    	}
    	if(n >=2) {
	         System.out.println(n);
	      }else {System.out.println("Entered number is not equal to 2");}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		primefactor(n);

	}

}
