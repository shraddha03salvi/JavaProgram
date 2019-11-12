package Programs;


//Used command line arguments for prints the Euclidean distance
public class Distance {
	public static void distance(int x2, int y2) {
		int x1=0;
		int y1 =0;
		int xs = (x2-x1);
		int ys = (y2-y1);
		 xs *= xs;
	        ys *= ys;

	        double distance = Math.sqrt(xs + ys);
	        System.out.println("Result is " +distance);
	}

	public static void main(String[] args) {
		int x2 = Integer.parseInt(args[0]);
		int y2=Integer.parseInt(args[1]);
		distance(x2,y2);
	}

}
