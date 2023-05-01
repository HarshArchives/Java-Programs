package ClassPrograms;
import java.util.*;
//Traversing
public class TwoDArray {
    public static void main(String[] args) {
        int [][]twoD= new int [2][2];
        int i,j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the elements : ");
        for( i = 0 ; i < 2 ; i++){
            for( j = 0 ;  j < 2 ; j++){
                twoD [i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered elements are : ");
        for( i = 0 ; i < 2 ; i++){
            for( j = 0 ;  j < 2 ; j++){
                System.out.print(twoD [i][j]+"\t");
            }
            System.out.println();
        }
    }
}
