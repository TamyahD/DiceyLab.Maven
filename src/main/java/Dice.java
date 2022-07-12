import java.util.ArrayList;
import java.util.List;

public class Dice {
//    int dotsValue;
//    int dotsValue;
//    static int tossSum;
//    List<Integer> tossResultList = new ArrayList<>();
//    static List<Integer> tossSumResultList = new ArrayList<>();
//    Dice() {
//        this.dotsValue = 1;
//        this.numOfTosses = 1;
//    }
    static List<Integer> sumList = new ArrayList<>();
    static int numOfDie;

    Dice(int numOfDice) {
        this.numOfDie = numOfDice;
    }

    int tossAndSum() {
        int sum = 0;
//        int temp=0;
        for (int i = 0; i <numOfDie; i++) {
//            sum += (int)(Math.random() * 6) + 1;
            sumList.add((int)(Math.random() *6) +1);
//            sumList.add(sum);
//            temp += sumList.get(i);
//            System.out.println("Dice #"+i + " roll result= " +sumList)
        }
//        System.out.println(sumList);
//        System.out.println(sumList.size());
        for (int x=0; x<sumList.size(); x+=2) {
            sum=0;
            sum+=sumList.get(x);
            sum+=sumList.get(x+1);
//            sum+=sumList.indexOf(everyPair+1);
        }
//        System.out.println(sumList);
        return sum;
    }
}
//            System.out.print(sumList);


/*
            System.out.println("roll " + i + ": " + dotsValue);
            tossResultList.add(dotsValue);
            System.out.println(tossResultList);
        }
        for (int toss:tossResultList) {
            tossSum+=toss;
        }
        System.out.println("sum =" +tossSum);
        tossSumResultList.add(tossSum);
*/

/*
    =(int)(Math.random()*6) + 1;

    Dice(int setValue) {
        value = setValue;
    }
    Dice(int timesToToss) {
        return value;
    }
    int tossAndSum(){
        return 0;
    }

    int roll() {
        this.rollValue = (int)(Math.random()*6) + 1;
        return rollValue;
    }
*/
