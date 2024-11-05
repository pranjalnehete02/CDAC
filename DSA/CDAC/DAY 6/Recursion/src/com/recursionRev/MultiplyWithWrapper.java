package com.recursionRev;

public class MultiplyWithWrapper {
    public static int multiply(int a, int b) {
        if (a > b) {
            return multiplyHelper(b, a);  // Swap to reduce recursion depth
        } else {
            return multiplyHelper(a, b);
        }
    }

    private static int multiplyHelper(int smaller, int larger) {
        if (smaller == 0) {
            return 0;
        }
        return larger + multiplyHelper(smaller - 1, larger);
    }

    public static void main(String[] args) {
        System.out.println(multiply(100, 3));  // Output: 300
    }
}
