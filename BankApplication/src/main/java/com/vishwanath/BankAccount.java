package com.vishwanath;

public interface BankAccount {
    public int getBalance();
    public void setBalance(int balance);
    public String getCustomerName();
    public void setCustomerName(String customerName);
    public String getCustomerID();
    public void setCustomerID(String customerID);
//    public void subscribe(Observer sub);
    public void notifySubscriber(String title);
    public void deposit(int amount);
    public void withdraw(int amount);
}
