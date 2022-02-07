package part4.unit1;

import org.junit.Assert;
import org.junit.Test;

public class ConverterCTest {

    @Test
    public void calculatorTest(){
        ConverterC converterC = new ConverterC();
        double expected = 12.5;
        double  actual = converterC.calculator(54.5);
        Assert.assertEquals(expected, actual, 0.05);
    }
}
