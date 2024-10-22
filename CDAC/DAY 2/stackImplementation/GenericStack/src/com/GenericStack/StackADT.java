package com.GenericStack;


//Stack ADT
interface StackADT<T> {
 void push(T element);              // Add element to the stack
 T pop() throws IllegalStateException;  // Remove and return the top element
 T peek() throws IllegalStateException; // View the top element without removing
 boolean isEmpty();                 // Check if stack is empty
 int size();                        // Return the current size of the stack
}
