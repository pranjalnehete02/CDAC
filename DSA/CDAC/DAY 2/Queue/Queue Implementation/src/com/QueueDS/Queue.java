package com.QueueDS;

class Queue implements OpsOnQueue {
    private int front, rear, size;  // Pointers to manage the queue
    private int capacity;           // Max capacity of the queue
    private int[] queueArray;       // Array to store the queue elements

    // Constructor to initialize the queue with a fixed capacity
    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = 0;             // Front points to the first element (initially 0)
        this.rear = -1;             // Rear starts from -1 (empty state)
        this.size = 0;              // Size is initially 0
        this.queueArray = new int[capacity];  // Create an array with given capacity
    }

    // Check if the queue is full
    @Override
    public boolean isFull() {
        return size == capacity;  // Queue is full if the size equals capacity
    }

    // Check if the queue is empty
    @Override
    public boolean isEmpty() {
        return size == 0;  // Queue is empty if the size is 0
    }

    // Enqueue operation: Add an element at the rear of the queue
    @Override
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue " + data);
            return;  // Exit if the queue is full
        }
        rear = (rear + 1) % capacity;  // Circular increment for the rear pointer
        queueArray[rear] = data;       // Add the new element at the rear
        size++;                        // Increase the size of the queue
        System.out.println(data + " enqueued to the queue.");
    }

    // Dequeue operation: Remove the front element from the queue
    @Override
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return;  // Exit if the queue is empty
        }
        System.out.println(queueArray[front] + " dequeued from the queue.");
        front = (front + 1) % capacity;  // Circular increment for the front pointer
        size--;                          // Decrease the size of the queue
    }

    // Peek operation: Get the front element without removing it
    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, no element to peek.");
            return -1;  // Return special value if the queue is empty
        }
        return queueArray[front];  // Return the front element
    }

    // Traverse the queue and display all elements from front to rear
    @Override
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[(front + i) % capacity] + " ");
        }
        System.out.println();  // Move to the next line after displaying all elements
    }
}
