package ALgortimic;

public class sqrt {
	public static void sqrt(double c) {
		double epsilon = 1.0e-15; 
		double t = c; 
		while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
	}

	public static void main(String[] args) {
		
		double c = Double.parseDouble(args[0]);
		sqrt(c);
	}

}
