package Queues;

public interface QueueADT {

//Queue ADT
 void enqueue(int element);              // Add element to the end of the queue
 int dequeue() throws IllegalStateException;  // Remove and return the front element
 int peek() throws IllegalStateException; // View the front element without removing
 boolean isEmpty();                 // Check if queue is empty
 int size();                        // Return the current size of the queue
}

