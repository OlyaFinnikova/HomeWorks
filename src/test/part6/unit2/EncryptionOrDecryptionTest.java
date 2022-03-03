package part6.unit2;

import org.junit.Assert;
import org.junit.Test;

public class EncryptionOrDecryptionTest {
   public EncryptionOrDecryption encryptionOrDecryption = new EncryptionOrDecryption();
    @Test
    public void readFile(){
        String actual = encryptionOrDecryption.readFile("src/property/part6u1read.txt").toString();
        Assert.assertEquals("Привет друг \n",actual);
    }
    @Test
    public void overWrite(){
        encryptionOrDecryption.overWrite("src/property/part6test.txt",1,"расшифровать");
        String actual = encryptionOrDecryption.readFile("src/property/part6test.txt").toString();
        Assert.assertEquals("wxy!\n",actual);
    }
}
