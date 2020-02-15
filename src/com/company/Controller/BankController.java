package com.company.Controller;

import com.company.Logic.Generator;
import com.company.Model.Account;
import com.company.View.View;

import java.util.Scanner;

public class BankController {
    private Account account;
    private View view;
    private Generator generator;
    Scanner keyboard = new Scanner(System.in);


    public BankController(Account account, View view, Generator generator) {
        this.account = account;
        this.view = view;
        this.generator = generator;
    }

    public void  initializeSequence(){
        view.welcomeUser();
        String name = keyboard.nextLine();
        account.setAccountName(name);
        int accountNumber = generator.generateAccountNumber();
        account.setAccountNumber(accountNumber);
        view.openAccount(name, accountNumber);
        nextSteps();
    }

    private void nextSteps() {
        view.nextSteps();
        int response = keyboard.nextInt();

        switch (response){
            case 1: save();
            case 2: withdraw();
            case 3: checkBalance();
        }

    }

    private void checkBalance() {
        view.checkBalance(account.getAccountName(), account.getAccountNumber(), String.valueOf(account.getBalance()));
        nextSteps();

    }

    private void save() {
        view.saveQuery();
        double amount = keyboard.nextDouble();
        double newBalance = account.getBalance() + amount;
        account.setAccountBalance(newBalance);
        view.saveCash(amount);
        nextSteps();
    }

    private void withdraw() {
        view.withdrawQuery();
        double amount = keyboard.nextDouble();
        double newBalance = account.getBalance() - amount;
        account.setAccountBalance(newBalance);
        view.withdrawCash(amount);
        nextSteps();
    }
}
