package Programs;

public class Gambler {

	public static void main(String[] args) {
		int stake  = Integer.parseInt(args[0]);    // stake means Money or property risked on the result of a horse race, card game, match outcome, etc.
        int goal   = Integer.parseInt(args[1]);    // goal means gambler's desired 
        int trials = Integer.parseInt(args[2]);    // number of trials to play

        int bets = 0;        // total number of bets 
        int wins = 0;        // total number of games 

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
	}


