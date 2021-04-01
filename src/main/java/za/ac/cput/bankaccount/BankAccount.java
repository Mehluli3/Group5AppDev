/**
 * BankAccount.java
 * This is a model class
 * @author Christopher Doolings (218338376)
 * Date: 1 April 2021
 */

package za.ac.cput.bankaccount;

public class BankAccount {

    private long accNumber;
    private String accHolder;
    private String accType;
    private double balance;

    public BankAccount() {
        this.accNumber = 0;
        this.accHolder = "";
        this.accType = "";
        this.balance = 0;
    }

    public BankAccount(long accNumber, String accHolder, String accType, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.accType = accType;
        this.balance = balance;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void show() {
        System.out.println("Your acccount number is....." + accNumber);
        System.out.println("Account holder name....." + accHolder);
        System.out.println("Your account type....." + accType);
        System.out.printf("Your account balance.....R%.2f\n", balance);

    }

    public void deposit(double amount) {
        amount += balance;
        System.out.printf("New balance......R%.2fn\n", amount);
    }

    public boolean withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.printf("Current balance.....R%.2fn\n", balance);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accNumber=" + accNumber +
                ", accHolder='" + accHolder + '\'' +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
