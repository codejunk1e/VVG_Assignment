package com.company.View;

public class View {

    public void welcomeUser(){
        System.out.println("Hello New Customer, Welcome to VVG Bank! We would Like to open an account for you, please enter your name and click return or enter");
    }

    public void openAccount( String accountName, int accountNumber){
        System.out.println("Yipeee! Your Account has been setup with name: " + accountName + " and number "  + accountNumber);
    }

    public void checkBalance(String accountName, int accountNumber, String balance){
        System.out.println("The account Balance for account number " + accountNumber + " with name  "+accountName +" is "+ balance + " Naira");
    }
    public void nextSteps(){
        System.out.println("What would you like to do next? \n  1. Save Cash \n 2.Withdraw Cash \n 3.Check Balance");
    }
    public void saveQuery(){
        System.out.println("How much would You like to save in your account?");
    }
    public void saveCash(double amount){
        System.out.println("You Have added #" +amount +" to your account ");
    }
    public void withdrawQuery(){
        System.out.println("How much would You like to withdraw from your account?");
    }
    public void withdrawCash(double amount){
        System.out.println("You Have removed #" +amount +" from your account ");
    }

    public void goodbyeGreeting(){
    System.out.println("Okay!!! Thank you for Banking with us, see you later!");
    }
}
