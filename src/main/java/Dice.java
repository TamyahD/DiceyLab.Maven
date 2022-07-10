import java.util.ArrayList;
import java.util.List;

public class Dice {
    int dotsValue;
    int numOfTosses;

    Dice() {
        this.dotsValue = 1;
        this.numOfTosses = 1;
    }
    Dice(int numOfTosses) {
        this.numOfTosses = numOfTosses;
    }


    int tossAndSum() {
        List<Integer> tossResultList = new ArrayList<>();
        int tossSum =0;

        //
        for (int i = 1; i <=numOfTosses; i++) {
            dotsValue = (int) (Math.random() * 6) + 1;
            System.out.println("roll " + i + "= " + dotsValue);
            tossResultList.add(dotsValue);
            System.out.println(tossResultList);
        }
        for (int toss:tossResultList) {
            tossSum+=toss;
        }
        System.out.println("sum =" +tossSum);

        return tossSum;
    }





//    =(int)(Math.random()*6) + 1;

/*
    Dice(int setValue) {
        value = setValue;
    }
*/
//    Dice(int timesToToss) {
//        return value;
//    }
//    int tossAndSum(){
//        return 0;
//    }

//    int roll() {
//        this.rollValue = (int)(Math.random()*6) + 1;
//        return rollValue;
//    }
}
