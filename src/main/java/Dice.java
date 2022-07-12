import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dice {
    static List<Integer> rollResultsList = new ArrayList<>();
    static Collection<Integer> sumsOfnElements;
    static int numOfDie;

    Dice(int numOfDice) {
        this.numOfDie = numOfDice;
    }

    int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numOfDie; i++) {
            rollResultsList.add((int) (Math.random() * 6) + 1);
            sum+=rollResultsList.get(i);
        }

        sumsOfnElements = IntStream.range(0,rollResultsList.size()).boxed().
                        collect(Collectors.groupingBy(i -> i / numOfDie-1,
                        Collectors.summingInt(rollResultsList::get))).values();
        return sum;
    }
}