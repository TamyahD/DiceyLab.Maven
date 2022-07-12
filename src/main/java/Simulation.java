import java.util.ArrayList;
import java.util.List;

public class Simulation {
    Dice dice;
    Bins bins;
    int numOfDie, numOfTosses, min, max;

    Simulation(int numOfDice, int numOfTosses) {
        min = numOfDice;
        max = numOfDice*6;
        dice = new Dice(numOfDice);
        bins = new Bins(min, max);
        this.numOfTosses = numOfTosses;
        this.numOfDie = numOfDice;
    }

    void runSimulation() {
        List<Integer> rollsSumList = new ArrayList<>();
        int count=1;
        int valCount = 0;

        for (int rollStart=0; rollStart<numOfTosses; rollStart++) {
            int rollValue = dice.tossAndSum();
            count++;
        }
        rollsSumList.addAll(Dice.sumsOfnElements);

        for (int rS:rollsSumList) {
            if (Bins.results.containsKey(rS)) {
                Bins.results.put(rS, Bins.results.get(rS) +1);
            }
        }
        System.out.println(Bins.results);
    }



    public String getStars(int number){
        String result ="";
        for(int x=0;x<number;x++){
            result += "*";
        }
        return result;
    }
    void printResults() {
        String output;
        System.out.println("\n" +numOfDie+" dice tossed " +numOfTosses +" times.");
        System.out.println("------------------------------------------");
        System.out.println("");
        int sum =0;
        double dec = 0.0;

        for (int starIdx =numOfDie; starIdx <= max; starIdx++) {
            sum = bins.getBin(starIdx);
            dec = (double) sum/numOfTosses;
            dec = dec *100;
            output = String.format("%3d : %9d    %.2f", starIdx, sum, dec);
            output = output.concat(getStars((int) dec));
            System.out.println(output);
        }
    }
}



/*
    Simulation(int numOfDice, int numOfTosses) {
        this.dice = new Dice(numOfDice);
        this.bins = new Bins(numOfDice, numOfDice*6);
        this.numOfTosses = numOfTosses;
        this.numOfDice = numOfDice;
    }

    void runSimulation() {
        for (int i = 0; i < numOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }


    void printResults() {
        int res = 0;
        double p;
        System.out.println("The result of " + numOfDice + " dice being rolled " + numOfTosses + " times...");
    }


    static int numOfDice;
    static int numOfTosses;

    public static void main(String[] args) {
//        Simulation sim = new Simulation(2, 8);
    }

    Simulation(int numOfDieToThrow, int numOfTosses) {
        this.numOfDice = numOfDieToThrow;
        Dice.numOfTosses = numOfTosses;
    }

    void runSimulation() {

    }

    public static void main(String[] args) {
        Dice dice1 = new Dice(2);
        dice1.tossAndSum();
        Bins results = new Bins(2, 12);
        int numOf6s = results.getBin(6);
        System.out.println("\nNumber of occurrences for #6= " + numOf6s);
//        System.out.println(dice2.roll());
    }
*/


