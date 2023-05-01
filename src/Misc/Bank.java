package Misc;

public class Bank {
    private double interest,balance;
    private long accountNo;

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest,double balance) {
        this.interest = interest;
        this.balance = balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public static void main(String[] args) {

    }
}
