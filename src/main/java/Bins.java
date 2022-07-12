import java.util.Map;
import java.util.TreeMap;

public class Bins {
    static Map<Integer, Integer> results = new TreeMap<>();


    Bins(int minTossResult, int maxTossResult) {
        for (int mapKey=minTossResult; mapKey<=maxTossResult; mapKey++) {
////            System.out.println(Dice.sumList);
            results.put(mapKey, 0);
        }
    }

    int getBin(int binNumber) {
        return results.get(binNumber);
    }

    int incrementBin(int binNumber) {
        return results.get(binNumber);
    }




/*
    int[] binsList;
    int minRollResult;

    Bins(int minRollResult, int maxRollResult) {
        this.minRollResult = minRollResult;
        binsList = new int[maxRollResult-1];
    }

    int getBin(int binNumber) {
        return binsList[binNumber-minRollResult];
    }

    void incrementBin(int binNumber) {
        binsList[binNumber-minRollResult]++;
    }
*/

/*
        int bin = binsList.indexOf(binNumber);
        return binsList.get(bin);
*/

/*
    int count=0;

    Bins(int numOfDice, int maxValueFromToss) {
        Simulation.numOfDice = numOfDice;
        numOfDice*2 = maxValueFromToss;
    }

    int getBin(int tossResult) {
        for (int el:Dice.tossSumResultList) {
            if (el == tossResult) {
                this.count++;
            }
        }
        return this.count;
    }


    int incrementBin(int binNumber) {
        return 0;
    }
*/

}
