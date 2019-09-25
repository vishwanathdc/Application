package com.vishwanath;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountImpl implements BankAccount {

    private String customerName = "Vishwanath";
    private String customerID = "1001";

    private int balance =1000;

    private double interestRate;

    private final Observer observer;

    @Autowired
    public BankAccountImpl(Observer observer,@interestRate double interestRate) {
        this.observer = observer;
        this.interestRate = interestRate;
    }


    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName=customerName;
    }

    @Override
    public String getCustomerID() {
        return customerID;
    }

    @Override
    public void setCustomerID(String customerID) {
        this.customerID=customerID;
    }

    @Override
    public void notifySubscriber(String title) {
        this.observer.update(title);
    }

    @Override
    public void deposit(int amount) {
        if(amount > 0) {
            balance+=amount;
            notifySubscriber("deposited amount: " + amount);
        }
    }

    @Override
    public void withdraw(int amount) {
        if(balance < amount){
            System.out.println("Your available balance is " + balance + ". Your withdrawal amount should not be more than this.");
        }
        else {
            balance -= amount;
            notifySubscriber("withdrawn amount: " + amount);
        }
    }
}
