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
        Dice testDice = new Dice();
        //When
        int rollResult = testDice.roll();
        int startVal = 1;
        int endVal = 6;
        //Then
        Assert.assertTrue((startVal<=rollResult && rollResult<=endVal)); //roll within 1-6 range
    }
}