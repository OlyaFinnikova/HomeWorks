package part5.unit3;

public class App {
    public static void main(String[] args) {
        Program program = new Program();
       program.setStatus(new StatusON());
        for(int i=0;i<4;i++){
            program.doSomething();
        }
    }
}
