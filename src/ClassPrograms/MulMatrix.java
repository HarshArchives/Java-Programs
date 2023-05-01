package ClassPrograms;

import java.util.Scanner;

public class MulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k;
        System.out.print("Enter the size of rows & columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] A = new int [r][c];
        int[][] B = new int [r][c];
        int[][] mul = new int [r][c];

        System.out.print("Enter element of matrix A : ");
        for(i = 0; i < r ; i++){
            for(j = 0 ; j < c ; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element of matrix B : ");
        for(i = 0; i < r ; i++) {
            for(j = 0 ; j < c ; j++){
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Elements of matrix A are : ");
        for(i = 0; i < r ; i++){
            for(j = 0 ; j < c ; j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Elements of matrix B are : ");
        for(i = 0; i < r ; i++){
            for(j = 0 ; j < c ; j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }

        for(i = 0; i < r ; i++){
            for(j = 0; j < c ; j++){
                for(k = 0 ; k < c ; k++){
                    mul[i][j] += A[i][k] * B[k][j] ;
                }
            }
        }

        System.out.println("The multiplication of Matrix A & B is : ");
        for(i = 0; i < r ; i++){
            for(j = 0 ; j < c ; j++){
                System.out.print(mul[i][j]+"\t");
            }
            System.out.println();
            sc.close();
        }
    }
}
