package part2.unit4;


public class Main {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        Calculator myCalculator = new Calculator();

        System.out.println("x+y=" + myCalculator.addition(x, y));
        System.out.println("x-y=" + myCalculator.subtraction(x, y));
        System.out.println("x*y=" + myCalculator.multiplication(x, y));
        System.out.println("x/y=" + myCalculator.division(x, y));
    }
}
