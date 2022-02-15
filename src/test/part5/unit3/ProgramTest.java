package part5.unit3;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
    @Test
    public void start(){
        Program program = new Program();
        String expected = "Работает";
        String[] userValue = {"1","1","0"};
        program.determineStatus(userValue);
        String actual = program.work();
        Assert.assertEquals(expected,actual);
    }
}
