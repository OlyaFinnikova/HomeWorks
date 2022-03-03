package part6.unit3;

public class App {
    public static void main(String[] args) {
        UserValue value = new UserValue();
        new OverWriting().start(value.getEncodingFile(),"src/property/part6u1read.txt");
    }
}
