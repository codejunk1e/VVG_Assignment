package com.company;
import com.company.Controller.BankController;
import com.company.Logic.AccountNumberGenerator;
import com.company.Model.Account;
import com.company.View.View;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BankController controller = new BankController(new Account(), new View(), new AccountNumberGenerator());
        controller.initializeSequence();

    }
}
