package part6.unit3;

import org.junit.Assert;
import org.junit.Test;

public class OverWritingTest {
    @Test
    public void startTest() {
        OverWriting overWriting = new OverWriting();
        overWriting.start("UTF-8", "src/property/part6test.txt");
        String actual = overWriting.read("windows-1251","src/property/part6test.txt").toString();
        Assert.assertEquals("Привет друг\n",actual);
    }
}
