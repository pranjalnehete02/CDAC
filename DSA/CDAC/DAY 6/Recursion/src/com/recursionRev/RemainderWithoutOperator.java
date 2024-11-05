package com.recursionRev;

public class RemainderWithoutOperator {
    public static int remainder(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (dividend < divisor) {
            return dividend;  // Base case
        }
        return remainder(dividend - divisor, divisor);  // Recursive remainder
    }

    public static void main(String[] args) {
        System.out.println(remainder(10, 3));  // Output: 1
    }
}
