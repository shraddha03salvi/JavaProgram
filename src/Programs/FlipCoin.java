package Programs;

import java.util.Scanner;

public class FlipCoin {


	public static void flipCoin()
	{
		 int counter=0;
		 int head = 0; int tails = 0;
		 int toss;
		 
		 double random = Math.random();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter amount of time to toss the coin ");
		 toss = sc.nextInt();
		 while(counter < toss) 
		 {
			 if(random>0.5) 
			 {
				 head++;
				 System.out.println("Head");
			 }
			 else 
			 {
				 tails++;
				 System.out.println("Tail");
			 }
			 counter++;
			 random = Math.random();
		 }
		 System.out.println("");
	System.out.println("for your tosses you got \n"+"-----------\n"+"Head : "+head+"\nTail : "+tails);
	
	double headCount = head;
	
	double percentHeads = (headCount/toss)*100;
    double percentTails = (100 - percentHeads);
    System.out.println("percentage of Head" +percentHeads);
    System.out.println("percentage of Tail" +percentTails);
	}
	
	public static void main(String[] args) 
	
	{
		flipCoin();
	}

}
