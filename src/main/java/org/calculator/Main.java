package org.calculator;

import static org.calculator.SumCalculator.sum;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int result = sum(n);
        System.out.println("Sum: " + result);
    }
}
