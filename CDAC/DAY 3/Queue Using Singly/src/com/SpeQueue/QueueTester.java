package com.SpeQueue;

public class QueueTester {
    public static void main(String[] args) {
        // Create a queue of integers
        QueueADT queue = new QueueLinkedList();

        // Enqueue elements onto the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Peek the front element
        System.out.println("Front element (peek): " + queue.peek());

        // Dequeue elements from the queue
        queue.dequeue();
        queue.dequeue();

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Dequeue the last element
        queue.dequeue();

        // Check the size of the queue
        System.out.println("Current queue size: " + queue.size());

        // Try to dequeue from an empty queue (this should throw an exception)
        try {
            queue.dequeue();  // This should fail
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
