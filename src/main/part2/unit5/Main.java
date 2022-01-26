package part2.unit5;

public class Main {
    public static void main(String[] args) {
        int[][] userMatrix = {
                {1, 2},
                {5, -5}
        };
        Matrix matrix = new Matrix();
        matrix.setElement(userMatrix, 1, 1, 3);
        System.out.println(matrix.getElement(userMatrix, 1, 1));
        matrix.additionMatrix(userMatrix, userMatrix, 2);
        matrix.multiplicationMatrix(userMatrix, userMatrix, 2);
    }
}
