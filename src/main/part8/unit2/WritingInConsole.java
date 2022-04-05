package part8.unit2;

public class WritingInConsole implements Writing{

    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
