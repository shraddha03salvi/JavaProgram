package Stack;

public class Runner {

	public static void main(String[] args) {
		stack num = new stack();
		num.push(15);
		num.show();
		num.push(8);
		num.show();
		//System.out.println(num.peek());
		num.push(10);
		num.show();
		num.push(7);
		num.show();
		num.push(17);
		num.show();
		num.push(23);
		//System.out.println(num.pop());
  //System.out.println("Stack size is :" +num.size());
  //System.out.println("Empty =" + num.isEmpty());
		
		num.show();
	}

}
