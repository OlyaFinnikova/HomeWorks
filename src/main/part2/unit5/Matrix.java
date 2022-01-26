package part2.unit5;

public class Matrix {

    public int getElement(int[][] matrix, int line, int column) {
        return matrix[line - 1][column - 1];
    }

    public void setElement(int[][] matrix, int line, int column,int number) {
        matrix[line - 1][column - 1]=number;
    }

    public int[][] additionMatrix(int[][] matrix1,int[][] matrix2,int n){

        int [][] newMatrix=new int[n][n];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                newMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return newMatrix;
    }
    public int[][] multiplicationMatrix(int[][] matrix1,int[][] matrix2,int n){

        int [][] newMatrix=new int[n][n];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                newMatrix[i][j]=matrix1[i][j]*matrix2[i][j];
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return newMatrix;
    }
}
