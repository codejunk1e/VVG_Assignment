package com.company.Model;

public class Account {
    private  double accountBalance;
    private String accountName;
    private  int accountNumber;

    public Account(double balance,  String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountBalance = balance;
        this.accountNumber = accountNumber;
    }

    public Account() {
        this.accountBalance = 0.0;
        this.accountName = "";
        this.accountNumber = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
