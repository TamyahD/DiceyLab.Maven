import java.util.Map;
import java.util.TreeMap;

public class Bins {
    static Map<Integer, Integer> results = new TreeMap<>();

    Bins(int minTossResult, int maxTossResult) {
        for (int mapKey=minTossResult; mapKey<=maxTossResult; mapKey++) {
            results.put(mapKey, 0);
        }
    }

    int getBin(int binNumber) {
        return results.get(binNumber);
    }

/*
    int incrementBin(int binNumber) {
        return results.get(binNumber);
    }
*/
}
