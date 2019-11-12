package Programs;

public class printThreeNames {

	public static void printThreeNames(String str) {
		String [] arr = str.split(" ");
		System.out.println("Hi "+arr[3]+", "+arr[2]+", "+arr[1]+" .");
	}
	public static void main(String[] args) {
	 String str = "java manual selenium Automation QTP";
	 printThreeNames(str);
	}

}
