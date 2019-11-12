package Programs;

import java.util.Scanner;

public class TwoDArray {
  public static void return2DArrayInteger(int row, int column,Scanner scan) 
  {
	  System.out.println("Enter the Elements of Array");
	  int[][]arr = new int[row][column];
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<column;j++) {
			  arr[i][j]=scan.nextInt();
			  } }
	  for(int array[]:arr) {
		  for(int elements : array) 
		  {
			  System.out.print(elements+"  ");
		  }
		  System.out.println();
		  
	  }
  }
  public static void  return2DArraydouble(int row, int column, Scanner scan) 
  {
	  System.out.println("Enter the Elements of Array");
	  int[][]arr = new int[row][column];
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<column;j++) {
			  arr[i][j]=scan.nextInt();
			  }}
	  for(int array[]:arr) {
		  for(int elements : array) 
		  {
			  System.out.print(elements+"  ");
		  }
		  System.out.println();
		  
	  }
  }
  public static void return2DArrayboolean(int row, int column, Scanner scan) 
  { System.out.println("Enter the Elements of Array");
    int[][]arr = new int[row][column];
    for(int i=0;i<row;i++) {
		  for(int j=0;j<column;j++) {
			  arr[i][j]=scan.nextInt();
			  
		  }
	  } for(int array[]:arr) {
		  for(int elements : array) 
		  {
			  System.out.print(elements+"  ");
		  }
		  System.out.println();
	  }
	  
  }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of row and column");
        int row = scan.nextInt();
        int column = scan.nextInt();
        System.out.println("Select any option : \n1 for Integer  \n2 for double  \n3 for Boolean");
        int ch = scan.nextInt();
        switch(ch)
        {
        case 1 : return2DArrayInteger(row, column, scan);
                 break;
        case 2 : return2DArraydouble(row, column, scan);
                 break;
        case 3 : return2DArrayboolean(row,column,scan);
                 break;
        default: System.out.println("Selction is invalid");
        }
	}

}
