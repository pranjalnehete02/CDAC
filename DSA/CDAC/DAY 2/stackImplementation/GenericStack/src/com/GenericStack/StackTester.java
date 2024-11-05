package com.GenericStack;

public class StackTester {
    public static void main(String[] args) {
        // Create a stack of integers with initial capacity 3
        StackADT<Integer> intStack = new ResizableStack<>(3);

        // Push elements onto the stack
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        
        // The stack should resize at this point
        intStack.push(40);  // This should trigger a resize

        // Peek the top element
        System.out.println("Top element (peek): " + intStack.peek());

        // Pop elements from the stack
        intStack.pop();
        intStack.pop();

        // Check if the stack resizes down
        System.out.println("Current stack size: " + intStack.size());

        // Pop remaining elements
        intStack.pop();
        intStack.pop();

        // Check if stack is empty
        System.out.println("Is stack empty? " + intStack.isEmpty());
    }
}
