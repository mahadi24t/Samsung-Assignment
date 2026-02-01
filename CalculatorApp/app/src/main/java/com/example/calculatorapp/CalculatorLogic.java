package com.example.calculatorapp; // Change this to match your actual package name

public class CalculatorLogic {

    // We use double to handle decimal results (e.g., 5 / 2 = 2.5)
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Returns a special value (NaN) if dividing by zero, which we handle in the UI
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            return Double.NaN; // "Not a Number" - standard error flag
        }
        return num1 / num2;
    }
}