package ALgortimic;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt(); // declare size and take size as input
		// Declare array
		int [] arr = new int[n];
		System.out.println("Enter the values in array");
		for(int i =0;i<n;i++) 
		{
			arr[i] = sc.nextInt();
	
		}
		 
		System.out.println("Entered value for search");
		int num = sc.nextInt();
		 
		 int low=0;
		 int high= n-1;
		 int mid =0;
		 while(low <=high)
		 {
			 mid =(low+high)/2;
			 if(arr[mid]==num) 
			 {
				 System.out.println("Vlaue is found at index" +mid);
				 break;
			 }else if(arr[mid]>num) 
			 {
				 high = mid -1;
				 //mid =(low+high)/2;
			 }else if(arr[mid]<num) 
			 {
				 low = mid+1;
			 }
		 }
		if(low>high) {
			 System.out.println("Value is not found in array");
		 }
	}

}
