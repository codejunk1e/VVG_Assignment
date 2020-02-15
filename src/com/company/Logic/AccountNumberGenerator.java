package com.company.Logic;

import com.company.Logic.Generator;

import java.util.Random;

public class AccountNumberGenerator implements Generator {

    public  int generateAccountNumber(){
        Random random = new Random();
        return  Math.abs(1 + random.nextInt() *100000);
    }
}
