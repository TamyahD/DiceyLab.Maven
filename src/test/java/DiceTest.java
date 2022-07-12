import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

//    @Before
//    public void setUp() throws Exception {
//        Dice testDice = new Dice();
//    }

    @Test
    public void roll() {
        //Given
        Dice testDice = new Dice(3);
        //When
        int rollResult = testDice.tossAndSum();
        int startVal=3;
        int endVal=18;
        //Then
        System.out.println(rollResult);
        Assert.assertTrue(startVal<=rollResult && rollResult<=endVal); //roll within 1-6 range
    }
}