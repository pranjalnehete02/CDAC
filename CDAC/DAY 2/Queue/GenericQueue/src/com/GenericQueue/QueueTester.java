package com.GenericQueue;

public class QueueTester {
    public static void main(String[] args) {
        // Create a queue of integers with capacity 5
        QueueADT<Integer> intQueue = new GenericQueue<>(5);
        
        // Enqueue elements
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        
        // Traverse and check size
        intQueue.traverse();
        System.out.println("Queue size: " + intQueue.size());

        // Peek front element
        System.out.println("Front element: " + intQueue.peek());

        // Dequeue elements
        intQueue.dequeue();
        intQueue.traverse();
        System.out.println("Queue size: " + intQueue.size());

        // Create a queue of strings
        QueueADT<String> stringQueue = new GenericQueue<>(3);
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Banana");
        stringQueue.traverse();

        stringQueue.dequeue();
        stringQueue.traverse();
    }
}
