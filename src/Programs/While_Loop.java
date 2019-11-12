package Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class While_Loop {

	public static void main(String[] args) {
		int i = 5;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//Java while loop with Iterator
       
		List<String> veggies = new ArrayList<>();
		veggies.add("Spinach");
		veggies.add("Potato");
		veggies.add("Tomato");
		Iterator<String> it = veggies.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		int x= 10;
		
		System.out.println(++x);
		System.out.println(x);
	}

}
