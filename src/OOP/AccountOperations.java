package OOP;


import java.util.Scanner;

//Create a class Account with accountNumber, custName, balance and
//        interest rate. create method calculateInterest() which will calculate interest
//        and add to balance. create a method to displayAccountDetails()


/*Create a class Account with the attributes accountNo, custName,
accountBalance and
methods
setAccountDetails() which set the values to these attributes.
withdraw() which subtracts the given amount from the available balance
deposit() which adds a given amount to the available balance and
dispAccountDetails() which displays accountNo, custName,
accountBalance.
Create a class Main1 which contains the main() method to test the functionality of
Account class.*/
class Account {
    double accNo, balance;
    //    double rate;
    String custName;
    Scanner sc = new Scanner(System.in);

    Account() {
        balance = 0;
//        rate=2;

    }

    void widraw() {
        System.out.println("Enter Amount for widraw :- ");
        double val = sc.nextDouble();
        if (val > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        if (val <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance -= val;
        System.out.println("Your balance is :- " + balance);
    }

    void deposit() {
        System.out.println("Enter Balance for Deposit:- ");
        double val = sc.nextDouble();
        if (val <= 0) {
            System.out.println("Invalid balance amount");
            return;

        }
        System.out.println("Deposit Successfully ");
        balance += val;
        System.out.println("Your balance ;- " + balance);
    }

    void setAccountDetail() {
        System.out.println("Enter Name :- ");
        custName = sc.nextLine();
        System.out.println("Enter Account Number :- ");
        accNo = sc.nextDouble();
    }


    //    void calculateIntrest(){
//        balance+=(balance*rate/100);
//    }
    void display() {
        System.out.println("Name :- " + custName);
        System.out.println("AccNo :- " + accNo);
        System.out.println("Total Balance :- " + balance);
//        calculateIntrest();
//        System.out.println("After Intrest :- "+balance);

    }


}

public class AccountOperations {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAccountDetail();
        a1.display();
        a1.widraw();
        a1.deposit();
        a1.deposit();
        a1.widraw();
        a1.widraw();
        a1.display();
    }

}
