package ClassPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserDefinedException extends Throwable {
    UserDefinedException(String s) {
        super(s);
    }

    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your account number : ");
        int acc_no = Integer.parseInt(br.readLine());
        long balance = 5000;
        long withdraw_amount = Long.parseLong(br.readLine());
        try {
            if (withdraw_amount < balance) {
                System.out.println("Collect the cash");
            } else {
                throw new UserDefinedException("Insufficient Funds!");
            }
        } catch (UserDefinedException e) {
            System.out.println(e.getMessage());
        }
    }
}
