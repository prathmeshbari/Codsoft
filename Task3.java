
//ATM interface
import java.util.*;

class ATM {
    int balance;
    Scanner sc = new Scanner(System.in);
    int db = sc.nextInt();

    void deposite(int db) {
        System.out.println("Enter the amount : ");
        balance += db;
    }

    void withdraw(int db) {

        if (db < balance) {
            balance -= db;
            System.out.println("Remaining balance is : " + balance);
        } else {
            System.out.println("Insuficient Balance");

        }

    }

    void checkbalnce() {
        System.out.println("The Account balance is : " + balance);
    }
}

public class Task3 {
    public static void main(String[] args) {

        ATM user1 = new ATM();
        System.out.println("Welcome to ATM");
        System.out.println("1.Deposite");
        System.out.println("2.Withdraw");
        System.out.println("3.Checkbalance");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                user1.deposite();
                break;

            default:
                break;
        }
    }

}
