package part5.unit3;

import org.junit.Assert;
import org.junit.Test;

public class StatusONTest {
    @Test
    public void doSomethingTest() {
        Program program = new Program();
        StatusON statusON = new StatusON();
        int expected = 1;
        String[] userValue = {"1","1","0"};
        int actual = statusON.doSomething(program, userValue);
        Assert.assertEquals(expected, actual);
    }
}
