package com.elcalculador;

public class Calculator
{
    int result;
    public int addition(int a, int b) {
        result = a + b;
        System.out.println(result);
        return result;
    }

    public int soustraction(int a, int b) {
        result = a - b;
        System.out.println(result);
        return result;
    }

    public int multiplication(int a, int b) {
        result = a * b;
        System.out.println(result);
        return result;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro non autorisée");
        }
        result =  a / b;
        System.out.println(result);
        return result;
    }
}
