package part2.unit4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.addition(4, 2));
    }

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtraction(4, 2));
    }

    @Test
    public void multiplicationTest() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiplication(4, 2));
    }

    @Test
    public void divisionTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.division(4, 2));
    }
}