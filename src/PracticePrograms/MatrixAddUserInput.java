package PracticePrograms;

import java.util.Scanner;

public class MatrixAddUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,i,j;
        System.out.print("Enter The Size Of Rows & Columns : ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] S = new int[r][c];

        System.out.print("Enter the elements of Matrix A : ");
        for(i = 0; i < r ; i++){
            for(j = 0; j < c ; j++){
                A[i][j] = sc.nextInt();
            }

        }

        System.out.print("Enter the elements of Matrix B : ");
        for(i = 0; i < r ; i++){
            for(j = 0; j < c ; j++){
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of Matrix A are : ");
        for(i = 0; i < r ; i++){
            for(j = 0; j < c ; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Elements of Matrix B are : ");
        for(i = 0; i < r ; i++){
            for(j = 0; j < c ; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        for(i = 0; i < r ; i++) {
            for(j = 0 ; j < c ; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("The sum of Matrix A & B is : ");
        for(i = 0; i < r ; i++){
            for(j = 0 ; j < c ; j++){
                System.out.print(S[i][j]+"\t");
            }
            System.out.println();
            sc.close();
        }
    }
}

