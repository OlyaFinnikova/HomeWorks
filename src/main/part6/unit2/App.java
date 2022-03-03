package part6.unit2;

public class App {
    public static void main(String[] args) {
        UserValue userValue = new UserValue();
        new EncryptionOrDecryption().overWrite(userValue.getUserPath(), userValue.getUserShift(), userValue.getUserAction());
    }
}