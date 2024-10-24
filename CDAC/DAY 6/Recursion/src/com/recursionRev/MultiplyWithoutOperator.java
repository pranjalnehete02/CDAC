package com.recursionRev;

public class MultiplyWithoutOperator {
    public static int multiply(int a, int b) {
        if (b == 0) {  // Base case: when one number is zero
            return 0;
        }
        if (b > 0) {
            return a + multiply(a, b - 1);  // Positive case: keep adding 'a'
        } else {
            return -multiply(a, -b);  // Negative case: invert and recurse
        }
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 3));  // Output: 15
        System.out.println(multiply(-5, 3)); // Output: -15
    }
}
