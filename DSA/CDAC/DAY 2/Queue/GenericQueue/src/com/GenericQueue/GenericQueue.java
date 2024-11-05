package com.GenericQueue;

//Generic Queue class using an array
public class GenericQueue<T> implements QueueADT<T> {
 private T[] queueArray;         // Array to hold the queue elements
 private int front;              // Points to the front element
 private int rear;               // Points to the position where the next element will be inserted
 private int capacity;           // Maximum capacity of the queue
 private int currentSize;        // Current number of elements in the queue

 // Constructor to initialize the queue with a specific capacity
 @SuppressWarnings("unchecked")
 public GenericQueue(int capacity) {
     this.capacity = capacity;
     queueArray = (T[]) new Object[capacity];  // Create the array with generic type
     front = 0;                                // Initialize front pointer
     rear = -1;                                // Initialize rear pointer (empty queue)
     currentSize = 0;                          // Initially, the queue is empty
 }

 // Enqueue: Add an element to the rear of the queue
 @Override
 public void enqueue(T element) {
     if (isFull()) {
         throw new IllegalStateException("Queue is full, cannot add element: " + element);
     }
     // Calculate the next position for rear in a circular manner
     rear = (rear + 1) % capacity;
     queueArray[rear] = element;  // Insert the element
     currentSize++;               // Increment size
     System.out.println("Enqueued: " + element);
 }

 // Dequeue: Remove an element from the front of the queue
 @Override
 public T dequeue() {
     if (isEmpty()) {
         throw new IllegalStateException("Queue is empty, cannot dequeue.");
     }
     T element = queueArray[front];  // Get the front element
     queueArray[front] = null;       // Optional: Clear the spot for garbage collection
     // Move front pointer in a circular manner
     front = (front + 1) % capacity;
     currentSize--;                  // Decrement size
     System.out.println("Dequeued: " + element);
     return element;
 }

 // Peek: View the front element without removing it
 @Override
 public T peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Queue is empty, nothing to peek.");
     }
     return queueArray[front];  // Return the front element
 }

 // Check if the queue is empty
 @Override
 public boolean isEmpty() {
     return currentSize == 0;  // Queue is empty if size is 0
 }

 // Check if the queue is full
 @Override
 public boolean isFull() {
     return currentSize == capacity;  // Queue is full if current size equals capacity
 }

 // Return the number of elements in the queue
 @Override
 public int size() {
     return currentSize;
 }

 // Traverse the queue and display all elements
 @Override
 public void traverse() {
     if (isEmpty()) {
         System.out.println("Queue is empty.");
         return;
     }
     System.out.println("Queue elements are:");
     for (int i = 0; i < currentSize; i++) {
         System.out.print(queueArray[(front + i) % capacity] + " ");
     }
     System.out.println();  // Move to the next line after displaying all elements
 }
}
