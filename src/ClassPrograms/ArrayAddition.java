package ClassPrograms;

import java.util.*;
public class ArrayAddition {
    public static void main(String[] args) {
        //Creating a matrix a size of 2x2
        int[][] A = new int [2][2];
        //Creating a matrix b size of 2x2
        int[][] B = new int [2][2];
        //declaring a sum variable to store the summation of the matrices
        int[][] sum = new int [2][2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements for A matrix : ");
        int i,j;
        for(i = 0; i < 2 ; i++){
            for(j = 0 ; j < 2 ; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter elements for B matrix : ");
        for(i = 0; i < 2 ; i++){
            for(j = 0 ; j < 2 ; j++){
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of matrix A are : ");
        for(i = 0; i < 2 ; i++){
            for(j = 0 ; j < 2 ; j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Elements of matrix B are : ");
        for(i = 0; i < 2 ; i++){
            for(j = 0 ; j < 2 ; j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }

        for(i = 0; i < 2 ; i++){
            for(j = 0 ; j < 2 ; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The sum of Matrix A & B is : ");
        for(i = 0; i < 2 ; i++){
            for(j = 0 ; j < 2 ; j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
            sc.close();
        }
    }
}
