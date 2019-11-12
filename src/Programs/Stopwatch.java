package Programs;

import java.util.Date;

public class Stopwatch {
	  /** Time the Stopwatch started. */
    private long start = 0;

    /** Time the Stopwatch stopped. */
    private long stop = 0;
    public final void start() {
        start = System.currentTimeMillis();
    }
    public final void stop() {
        stop = System.currentTimeMillis();
    }

	public static void main(String[] args) {
		
 
	}

}
