package Stack;

public class CustomStack {
    
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor
    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push method with exception handling
    public void push(int value) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full! Cannot push element.");
        }
        stackArray[++top] = value;
    }

    // Pop method with exception handling
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty! Cannot pop element.");
        }
        return stackArray[top--];
    }

    // Peek method with exception handling
    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty! Cannot peek.");
        }
        return stackArray[top];
    }

    // Helper methods
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

// Custom exceptions
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}
