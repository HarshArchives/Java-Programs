package ClassPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOException extends Throwable {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your bank account number: ");
        long acc_no = Integer.parseInt(br.readLine());
        long balance = 5000;
        System.out.print("Enter the amount to withdraw: ");
        long withdraw_amount = Long.parseLong(br.readLine());
        if (withdraw_amount < balance) {
            System.out.println("Collect your cash!");
        } else {
            System.out.println("Insufficient funds can't withdraw");
        }
    }
}
