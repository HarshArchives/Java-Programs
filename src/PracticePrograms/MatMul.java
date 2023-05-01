package PracticePrograms;

import java.util.Scanner;

public class MatMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, i, j, k;
        System.out.print("Enter the row & columns size: ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];
        System.out.print("Enter the elements of Matrix A: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the elements of Matrix B: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of Matrix A are : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Elements of Matrix B are : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                for (k = 0; k < c; k++) {
                    C[i][j] += A[i][k] + B[k][j];
                }
            }
        }
        System.out.println("The multiplication of A & B is: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
            sc.close();
        }
    }
}
