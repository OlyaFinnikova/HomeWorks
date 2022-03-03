package part6.unit1;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTest {
    @Test
    public void readFileTest(){
        Reading reading = new Reading();
        String actual = reading.readFile(reading.path).toString();
        Assert.assertEquals("Привет друг 11\n",actual);
    }
}
