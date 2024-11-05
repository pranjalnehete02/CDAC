package Queues;
	

	//Queue implementation using a Singly Linked List
	public class QueueLinkedList implements QueueADT {
	 private Node front;   // Points to the front of the queue
	 private Node rear;    // Points to the rear of the queue
	 private int size;     // Number of elements in the queue

	 // Constructor to initialize an empty queue
	 public QueueLinkedList() {
	     this.front = null;   // Initially, the queue is empty, so front is null
	     this.rear = null;    // Rear is also null since there are no elements
	     this.size = 0;       // Size is 0
	 }

	 // Enqueue: Add an element to the end of the queue
	 @Override
	 public void enqueue(int element) {
	     Node newNode = new Node(element);  // Create a new node with the given element
	     if (isEmpty()) {
	         front = rear = newNode;  // If the queue is empty, both front and rear point to the new node
	     } else {
	         rear.next = newNode;  // Add the new node at the end of the queue
	         rear = newNode;       // Move rear to the new node
	     }
	     size++;  // Increment the size of the queue
	     System.out.println("Enqueued: " + element);
	 }

	 // Dequeue: Remove and return the front element from the queue
	 @Override
	 public int dequeue() {
	     if (isEmpty()) {
	         throw new IllegalStateException("Queue is empty, cannot dequeue.");
	     }
	     int data = front.data;   // Get the front element
	     front = front.next;      // Move the front pointer to the next node
	     if (front == null) {     // If the queue is now empty, rear should also be null
	         rear = null;
	     }
	     size--;  // Decrement the size of the queue
	     System.out.println("Dequeued: " + data);
	     return data;  // Return the removed element
	 }

	 // Peek: View the front element without removing it
	 @Override
	 public int peek() {
	     if (isEmpty()) {
	         throw new IllegalStateException("Queue is empty, nothing to peek.");
	     }
	     return front.data;  // Return the data of the front node
	 }

	 // Check if the queue is empty
	 @Override
	 public boolean isEmpty() {
	     return front == null;  // The queue is empty if front is null
	 }

	 // Return the current size of the queue
	 @Override
	 public int size() {
	     return size;  // Return the size of the queue
	 }
}
