package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        System.out.println("Test - first unit test");




        Calculator calculator = new Calculator(1.5, 4.5);

        double resultOfAdding = calculator.addAtoB();

        if(resultOfAdding = 6.0){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }



        double resultOfSubtracting = calculator.subtractAFromB();

        if(resultOfSubtracting = 2.0){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}