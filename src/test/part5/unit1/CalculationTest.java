package part5.unit1;

import org.junit.Assert;
import org.junit.Test;

public class CalculationTest {
    @Test
    public void start(){
        Calculation calculation = new Calculation();
        int expected = 19;
        int actual = calculation.chooseArithmeticAction(21,"-",2);
        Assert.assertEquals(expected,actual);
    }

}
