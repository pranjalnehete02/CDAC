package com.GenericQueue;

//Queue ADT
interface QueueADT<T> {
	 void enqueue(T element) throws IllegalStateException;  // Add element to the queue
	 T dequeue() throws IllegalStateException;              // Remove element from the queue
	 T peek() throws IllegalStateException;                 // View the front element
	 boolean isEmpty();                                     // Check if queue is empty
	 boolean isFull();                                      // Check if queue is full
	 int size();                                            // Return the number of elements in the queue
	 void traverse();
}

