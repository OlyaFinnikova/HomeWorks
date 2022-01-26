package part2.unit5;

import jdk.jfr.StackTrace;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    int[][] matrix1 = {
            {-1, 2},
            {6, 3}
    };
    int[][] matrixAddition = {
            {-2, 4},
            {12, 6}
    };
    int[][] matrixMultiplication = {
            {1, 4},
            {36, 9}
    };

    @Test
    public void getTest() {

        Matrix matrix = new Matrix();
        assertEquals(3, matrix.getElement(matrix1, 2, 2));
    }

    @Test
    public void setTest() {

        Matrix matrix = new Matrix();
        matrix.setElement(matrix1, 2, 2, 5);
        assertEquals(5, matrix1[1][1]);
    }

    @Test
    public void additionTest() {

        Matrix matrix = new Matrix();
        assertEquals(matrixAddition, matrix.additionMatrix(matrix1, matrix1, 2));
    }

    @Test
    public void multiplicationTest() {

        Matrix matrix = new Matrix();
        assertEquals(matrixMultiplication, matrix.multiplicationMatrix(matrix1, matrix1, 2));
    }
}