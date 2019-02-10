package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        double resultOfAdding = calculator.addAtoB(1.5, 4.5);

        if(resultOfAdding == 6.0){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }



        double resultOfSubtracting = calculator.subtractAFromB(1.5, 4.5);

        if(resultOfSubtracting == -3.0){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}