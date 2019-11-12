package ALgortimic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string");
	String str1= sc.nextLine();
	System.out.println("Enter second string");
	String str2 = sc.nextLine();
	
	//convert string to chararray
	char [] arr1 = str1.toCharArray();
	char [] arr2 = str2.toCharArray();
	//sort array
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	String sortedstr1 = new String(arr1);
	String sortedstr2= new String(arr2);
	
	if(sortedstr1.equals(sortedstr2)) {
		System.out.println("Two Strings are Anagram");
	}else {
		System.out.println("Two strings are not anagram");
	}
	}

}
