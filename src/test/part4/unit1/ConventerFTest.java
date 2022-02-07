package part4.unit1;

import org.junit.Assert;
import org.junit.Test;

public class ConventerFTest {
    @Test
    public void calculatorTest(){
        ConverterF converterF = new ConverterF();
        double expected = 54.5;
        double  actual = converterF.calculator(12.5);
        Assert.assertEquals(expected, actual, 0.05);
    }
}
