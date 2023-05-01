package PracticePrograms;


import java.util.Scanner;

public class OneDArraySorting {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int len = sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int[] A = new int[len];
        for (i = 0; i < len; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        System.out.print("Array Elements are [ ");
        for (i = 0; i < len - 1; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[len - 1] + " ]");

        System.out.println("\nAfter Sorting: ");
        for (i = 0; i < len; i++) {
            for(j = 0;j < len-1 ; j++){
            int temp;
            if(A[j] > A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
             }
            }
        }
        System.out.print("Array Elements are [ ");
        for(i = 0; i < len - 1; i++){
            System.out.print(A[i] + ", ") ;
        }
        System.out.print(A[len-1] + " ]");
        sc.close();
    }
}
