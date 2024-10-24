package com.recursionRev;

public class DivideWithoutOperator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (dividend < divisor) {
            return 0;  // Base case
        }
        return 1 + divide(dividend - divisor, divisor);  // Recursive division
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));  // Output: 3
    }
}
