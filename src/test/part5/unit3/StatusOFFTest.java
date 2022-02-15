package part5.unit3;

import org.junit.Assert;
import org.junit.Test;

public class StatusOFFTest {
    @Test
    public void doSomethingTest() {
        Program program = new Program();
        StatusOFF statusOFF = new StatusOFF();
        int expected = 0;
        String[] userValue = {"1","0","0"};
        int actual = statusOFF.doSomething(program, userValue);
        Assert.assertEquals(expected, actual);
    }
}
