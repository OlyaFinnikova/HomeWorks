package part4.unit2;

import org.junit.Assert;
import org.junit.Test;

public class DirectorTest {
    @Test
    public void calculationTest() {
        Worker director = new Director();
        Assert.assertEquals(500000,director.calculation());
    }
}
