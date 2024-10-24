package com.recursionRev;

public class MultiplyWithNegatives {
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -multiply(a, -b);  // Handle negative
        }
        return a + multiply(a, b - 1);  // Regular case
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 3));    // Output: 15
        System.out.println(multiply(-5, 3));   // Output: -15
        System.out.println(multiply(5, -3));   // Output: -15
        System.out.println(multiply(-5, -3));  // Output: 15
    }
}
