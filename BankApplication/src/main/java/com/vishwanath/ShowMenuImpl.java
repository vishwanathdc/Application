package com.vishwanath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ShowMenuImpl implements ShowMenu {

    @Autowired
    private BankAccount bankAccount;

    public void Menu() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer: " + bankAccount.getCustomerName());
        System.out.println("CustomerID: " + bankAccount.getCustomerID());
        System.out.println("enter your option");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Previous Transaction");
        System.out.println("5. Calculate interest");
        System.out.println("6. Exit");

        do {
            System.out.println("*********************************************************");
            System.out.println("Enter your option");
            System.out.println("*********************************************************");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("**********************");
                    System.out.println("Enter the amount to deposit");
                    System.out.println("**********************");
                    int amount = sc.nextInt();
                    bankAccount.deposit(amount);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("**********************");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("**********************");
                    int withdraw  = sc.nextInt();
                    bankAccount.withdraw(withdraw);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("**********************");
                    System.out.println("your balance: " + bankAccount.getBalance());
                    System.out.println("**********************");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("**********************");
                    break;
                default:
                    System.out.println("**********************");
                    System.out.println("incorrect option, please try again");
                    System.out.println("**********************");
                    System.out.println();
                    break;
            }

        }while(choice != 4);
        System.out.println("Thank you for using our services. Good bye!");
    }
}
