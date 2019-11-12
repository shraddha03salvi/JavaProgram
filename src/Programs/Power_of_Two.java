package Programs;

public class Power_of_Two {
	public static void PowerofTwo(int n) {
		int i;
		if(n>31) {
			System.out.println("Invalid Input");
		}else {
			
		for(i=0;i<=n;i++) 
		{
			double result = Math.pow(2, i);
			System.out.println("2 ^ "+i+" " +result);
		}
		
		}
		
	}
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		PowerofTwo(n);

	}

}
