package Projects;

import java.util.Scanner;
//random number guess game
public class Proj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int MyNumber = (int)(Math.random()*100);
        do{
            System.out.println("Guess The Number : ");
            userNumber = sc.nextInt();

            if(userNumber == MyNumber){
                System.out.println("Wohoo!....Your Guess is Correct!");
                break;
            }
            else if (userNumber > MyNumber) {
                System.out.println("Your Number is Too Large!");
            }
            else {
                System.out.println("Your Number is Too Small!");
            }
        } while (userNumber >= 0);
    }
}
