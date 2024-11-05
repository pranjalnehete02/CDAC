package com.GenericStack;

//Resizable Stack class using an array
public class ResizableStack<T> implements StackADT<T> {
 private T[] stackArray;   // Array to store stack elements
 private int top;          // Points to the top element in the stack
 private int capacity;     // Current capacity of the stack

 // Constructor to initialize the stack with a starting capacity
 @SuppressWarnings("unchecked")
 public ResizableStack(int initialCapacity) {
     this.capacity = initialCapacity;
     stackArray = (T[]) new Object[initialCapacity];  // Create the array with generic type
     top = -1;                                        // Stack is initially empty
 }

 // Push: Add an element to the top of the stack
 @Override
 public void push(T element) {
     if (top == capacity - 1) {
         // If the stack is full, resize the array (double the capacity)
         resizeArray(2 * capacity);
     }
     stackArray[++top] = element;  // Increment top and insert the element
     System.out.println("Pushed: " + element);
 }

 // Pop: Remove and return the top element from the stack
 @Override
 public T pop() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty, cannot pop.");
     }
     T element = stackArray[top];   // Get the top element
     stackArray[top--] = null;      // Clear the spot and decrement top
     // Resize the array to half the size if the number of elements is less than 1/4 of the capacity
     if (top > 0 && top == capacity / 4) {
         resizeArray(capacity / 2);
     }
     System.out.println("Popped: " + element);
     return element;
 }

 // Peek: View the top element without removing it
 @Override
 public T peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty, nothing to peek.");
     }
     return stackArray[top];  // Return the top element
 }

 // Check if the stack is empty
 @Override
 public boolean isEmpty() {
     return top == -1;  // Stack is empty if top is -1
 }

 // Return the current size of the stack
 @Override
 public int size() {
     return top + 1;  // Size is top index + 1 (since top starts at -1)
 }

 // Resize the array to the new capacity
 @SuppressWarnings("unchecked")
 private void resizeArray(int newCapacity) {
     T[] newArray = (T[]) new Object[newCapacity];  // Create a new array with the new capacity
     System.arraycopy(stackArray, 0, newArray, 0, size());  // Copy elements to new array
     stackArray = newArray;   // Assign the new array
     capacity = newCapacity;  // Update the capacity
     System.out.println("Resized stack to capacity: " + newCapacity);
 }
}
