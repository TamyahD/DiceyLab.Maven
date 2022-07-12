import java.util.ArrayList;
import java.util.List;

public class Simulation {
    Dice dice;
    Bins bins;
    int numOfDie, numOfTosses, min, max;
//    static int numOfTosses;

    Simulation(int numOfDice, int numOfTosses) {
        min = numOfDice;
        max = numOfDice*6;
        dice = new Dice(numOfDice);
        bins = new Bins(min, max);
//        bins = new Bins(numOfDice, numOfDice*6);
        this.numOfTosses = numOfTosses;
        this.numOfDie = numOfDice;

    }

    void runSimulation() {
        List<Integer> rollValList = new ArrayList<>();
        int count=1;
        int valCount = 0;

        for (int rollStart=0; rollStart<numOfTosses; rollStart++) {
//            dice = new Dice(this.numOfDice);
            int rollValue = dice.tossAndSum();
            System.out.println("Roll " + count +"=" +rollValue);
            rollValList.add(rollValue);
            count++;
        }
        System.out.println("Dice.sumList -> " +Dice.sumList);
        System.out.println("rollValList -> " +rollValList);
        System.out.println(Bins.results);
        System.out.println("");

        for (int rV:rollValList) {
            if (Bins.results.containsKey(rV)) {
                Bins.results.put(rV, Bins.results.get(rV) +1);
            }
        }
        System.out.println(Bins.results);



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
*/


//    static int numOfDice;
//    static int numOfTosses;
//
//    public static void main(String[] args) {
////        Simulation sim = new Simulation(2, 8);
//    }

//    Simulation(int numOfDieToThrow, int numOfTosses) {
//        this.numOfDice = numOfDieToThrow;
//        Dice.numOfTosses = numOfTosses;
//    }
//
//    void runSimulation() {
//
//    }

/*
    public static void main(String[] args) {
        Dice dice1 = new Dice(2);
        dice1.tossAndSum();
        Bins results = new Bins(2, 12);
        int numOf6s = results.getBin(6);
        System.out.println("\nNumber of occurrences for #6= " + numOf6s);
//        System.out.println(dice2.roll());
    }
*/


}
