package com.cdac.ImplementLL;

public class CustomLinkedList {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
					//ADD
	//At front
	public void addAtFront(int data) {
		//creating an node of data and next ptr 
		//in the space 
		Node newNode = new Node(data);
		//initializing the next block of the created 
		//node to head ptr of the existing node
		newNode.next = head;
		//Now, assigning the head to newNode
		head = newNode;
	}
	
	//At End
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			while (current.next != null) {
				//traversing till last and assigning 
				//current to the last index
				current = current.next;
			}
			//adding the new node at that index
			current.next = newNode;
		}
	}
	
	
	//At Specific Position
	public void addAtPos(int data, int position) {
		Node newNode = new Node(data);
		if(position < 1 || head == null) {
			addAtFront(data);
		}else {
			Node current = head;
			for(int i = 1; i < position -1 && current.next != null; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		
	}
	
}

