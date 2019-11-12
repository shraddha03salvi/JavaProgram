package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class General_For_Loop {

	public static void main(String[] args) {
		// General For loop
//		for(int i=5; i<=10; i++) {
//			System.out.println("Java General For loop example -" +i);
//		}

		// For each Loop
//		int[] intArray = {1,2,3,4,5};
//		for(int i : intArray) {
//			System.out.println("Java for each loop with array -" +i);	
//		}
//		List<String> fruits = new ArrayList<>();
//		fruits.add("Apple");
//		fruits.add("Mango");
//		fruits.add("Orange");
//		for(String f : fruits) {
//			System.out.println("Java for each loop with collection - -" +f);
//		}

		int[][] intArr = { { 1, -2, 3 }, { 0, 3 }, { 1, 2, 5 }, { 9, 2, 5 } };

		process: for (int i = 0; i < intArr.length; i++) {
			boolean allPositive = true;
			for (int j = 0; j < intArr[i].length; j++) {
				if (intArr[i][j] < 0) {
					allPositive = false;
					continue process;
				}
			}
			if (allPositive) {
				// process the array
				System.out.println("Processing " + Arrays.toString(intArr[i]));
			}
			
		}

	}

}
