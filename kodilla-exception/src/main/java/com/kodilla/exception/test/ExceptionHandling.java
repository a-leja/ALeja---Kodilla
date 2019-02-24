package com.kodilla.exception.test;




public class ExceptionHandling extends Exception {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5, 2.0);
        } catch (ExceptionHandling e) {
            System.out.print("The program has encountered an error!");
        } finally {
            System.out.print("Wrong variable values");
        }
    }
}
