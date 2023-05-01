package LabWorks;

import java.util.Scanner;

public class LabWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the first matrix: ");
        int rows1 = input.nextInt();
        System.out.print("Enter the number of columns in the first matrix / rows in the second matrix: ");
        int columns1Rows2 = input.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int columns2 = input.nextInt();

        int[][] matrix1 = new int[rows1][columns1Rows2];
        int[][] matrix2 = new int[columns1Rows2][columns2];

        System.out.print("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1Rows2; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter the elements of the second matrix: ");
        for (int i = 0; i < columns1Rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("The result of the matrix multiplication is: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1Rows2 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] resultMatrix = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1Rows2; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
}

