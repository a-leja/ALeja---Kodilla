package com.kodilla.testing.calculator;

public class Calculator
{
    double a;
    double b;

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double addAtoB(double a, double b) {
        return a + b;
    }

    public double subtractAFromB(double a, double b) {
        return a - b;
    }
}
