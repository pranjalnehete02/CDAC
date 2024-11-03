package com.cdac.Queue;

public class CustomQueue {
	//creating an node
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	//body for queue
	private Node front;
	private Node rear;
	private int size;
	
	public CustomQueue(){
		front = null;
		rear = null;
		size = 0;
	}
	
	//OPERATION
	public boolean isEmpty() {
		return front == null;
	}
	
								//ADDING ELEMENT	
	//at front
	public void enqueue(int data) {
		//creating new node to store the data
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	//at rear
	public void addrear(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	//at specific position
	public void insertAt(int data, int position) {
		//check if position is valid
		if(position < 0 || position > size) {
			System.out.println("Invalid position");
		}
		
		Node newNode = new Node(data);
		//if position is at front
		if(position <= 1 || front == null) {
			enqueue(data);
		}
		else {
			Node current = front;
			for(int count = 1; (count < position - 1) && (current.next != null) ; count++) {
				current = current.next;
			}
			
			newNode.next = current.next;
			current.next = newNode;
			
			//Update the rear if adding at end
			if(newNode == null) {
				rear = newNode;
			}
		}
		
	}
	
	
									//REMOVING
	
	public void removeFront() {
		if(front == null) {
			System.out.println("Queue is Empty, nothing to remove");
			return;
		}
		//logic for removing is the immediate next line only:
		front = front.next;
		//now if the queue becomes empty then
		if(front == null) {
			rear = null;
		}
}
	public void removeRear() {
		if(front == null) {
			System.out.println("Queue is empty, nothing to remove");
			return;
		}
		//if there's only 1 element
		if(front.next == null) {
			front = rear =null;
		}
		else {
			Node current = front;
			//traverse till second last
			for(; current.next != rear; current = current.next) {}
			current.next = null;
			rear = current;
		}
	}
	
	public void removeAtPos(int position) {
		if (front == null) {
			System.out.println("Empty Queue");
			return;
		}
		//remove from front if only 1 element is there
		if(position <= 1) {
			removeFront();
		}
		else {
			Node current = front;
			//find the target element using loop
			for(int i = 1; (i < position - 1) && (current.next != null); i++ ) {
				current = current.next;
			}
			//now if the current's next is null
			if(current.next == null) {
				System.out.println("Position out of Range");
			}
			else {
				current.next = current.next.next;
				//update last to current if it's next is removed
				if(current.next == null) {
					rear = current;
				}
			}
		}
	}
	
	//traversing
	public void traverse() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		Node current = front;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		CustomQueue queue = new CustomQueue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.traverse();
		
		queue.insertAt(41, 4);
		queue.removeAtPos(2);
		queue.traverse();
		
		queue.enqueue(51);
		queue.traverse();
		
		queue.removeRear();
		queue.traverse();
		
	}
	
}




































