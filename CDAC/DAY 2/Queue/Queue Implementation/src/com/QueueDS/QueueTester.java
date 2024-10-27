package com.QueueDS;

public class QueueTester {
    public static void main(String[] args) {
        Queue queue = new Queue(5);  // Create a queue with capacity of 5 elements

        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Try enqueuing an element when the queue is full
        queue.enqueue(60);

        // Traverse the queue (print all elements)
        System.out.println("Queue after enqueuing elements:");
        queue.traverse();

        // Peek the front element
        System.out.println("Front element is: " + queue.peek());

        // Dequeue an element (remove from the front)
        queue.dequeue();
        System.out.println("Queue after dequeuing one element:");
        queue.traverse();

        // Dequeue another element
        queue.dequeue();
        System.out.println("Queue after dequeuing another element:");
        queue.traverse();

        // Peek the front element again
        System.out.println("Front element is: " + queue.peek());

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
