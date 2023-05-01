package Projects;

//import required classes and packages

import java.util.Scanner;

public class atm {
    //main method starts
    public static void main(String[] args) {
        //declare and initialize balance, withdraw, and deposit
        int balance = 100000, withdraw, deposit;

        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine / स्वचलित मुद्रा गणक यन्त्र");
            System.out.println("Welcome To SBI / एसबीआई में आपका स्वागत है");
            System.out.println("Choose 1 for Withdraw / निकासी");
            System.out.println("Choose 2 for Deposit / जमा करें");
            System.out.println("Choose 3 for Check Balance / बैंक बैलेंस चेक करें");
            System.out.println("Choose 4 for EXIT / निकास");
            System.out.print("Choose the option you want / आप जो विकल्प चाहते हैं उसे चुनें : ");

            //get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter money to be withdrawn/निकाले जाने वाले पैसे दर्ज करें : ");

                    //get the withdrawl money from user
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withdraw) {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money/कृपया अपना पैसा प्राप्त करें");
                    } else {
                        //show custom error message
                        System.out.println("Insufficient Balance/अपर्याप्त शेषराशि");
                    }
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("Enter money to be deposited/जमा करने के लिए धन दर्ज करें : ");

                    //get deposit amount from the user
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balanace
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited/आपका पैसा सफलतापूर्वक जमा कर दिया गया है");
                    System.out.println();
                }
                case 3 -> {
                    //displaying the total balance of the user
                    System.out.println("Your Balance is/आपका बैलेंस है : " + balance);
                    System.out.println();
                }
                case 4 -> {
                    //exit from the menu
                    System.out.println("Thank You!/धन्यवाद");
                    System.exit(0);
                }
            }
        }
    }
}


//import required classes and packages
//import java.util.Scanner;
//
////create ATMExample class to implement the ATM functionality
//public class ATMExample
//{
//    //main method starts
//    public static void main(String args[] )
//    {
//        //declare and initialize balance, withdraw, and deposit
//        int balance = 100000, withdraw, deposit;
//
//        //create scanner class object to get choice of user
//        Scanner sc = new Scanner(System.in);
//
//        while(true)
//        {
//            System.out.println("Automated Teller Machine");
//            System.out.println("Choose 1 for Withdraw");
//            System.out.println("Choose 2 for Deposit");
//            System.out.println("Choose 3 for Check Balance");
//            System.out.println("Choose 4 for EXIT");
//            System.out.print("Choose the operation you want to perform:");
//
//            //get choice from user
//            int choice = sc.nextInt();
//            switch(choice)
//            {
//                case 1:
//                    System.out.print("Enter money to be withdrawn:");
//
//                    //get the withdrawl money from user
//                    withdraw = sc.nextInt();
//
//                    //check whether the balance is greater than or equal to the withdrawal amount
//                    if(balance >= withdraw)
//                    {
//                        //remove the withdrawl amount from the total balance
//                        balance = balance - withdraw;
//                        System.out.println("Please collect your money");
//                    }
//                    elsefire
//                    {
//                        //show custom error message
//                        System.out.println("Insufficient Balance");
//                    }
//                    System.out.println("");
//                    break;
//
//                case 2:
//
//                    System.out.print("Enter money to be deposited:");
//
//                    //get deposite amount from te user
//                    deposit = sc.nextInt();
//
//                    //add the deposit amount to the total balanace
//                    balance = balance + deposit;
//                    System.out.println("Your Money has been successfully depsited");
//                    System.out.println("");
//                    break;
//
//                case 3:
//                    //displaying the total balance of the user
//                    System.out.println("Balance : "+balance);
//                    System.out.println("");
//                    break;
//
//                case 4:
//                    //exit from the menu
//                    System.exit(0);
//            }
//        }
//    }
//}