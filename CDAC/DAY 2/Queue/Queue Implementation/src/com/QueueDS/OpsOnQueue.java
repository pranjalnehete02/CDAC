package com.QueueDS;

public interface OpsOnQueue {
	    void enqueue(int data);  // Add an element at the rear
	    void dequeue();          // Remove an element from the front
	    void traverse();         // Display all elements in the queue
	    boolean isEmpty();       // Check if the queue is empty
	    boolean isFull();        // Check if the queue is full (for array-based queue)
	    int peek();              // Get the front element without removing it
	}


