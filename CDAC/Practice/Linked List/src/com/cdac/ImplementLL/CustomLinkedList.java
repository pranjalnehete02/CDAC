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
			for(int i = 1; (i < position -1) && (current.next != null); i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		
	}
	
	
							//REMOVE
	//Remove Front
	public void rmAtFront() {
		//checking if the head is not empty
		if(head != null) {
			head = head.next;
		}
	}
	
	public void rmAtEnd() {
		//check if head is empty
		if(head == null) {
			return;
		}
		//check if only one element is present
		if(head.next == null) {
			head = null;
		}else {
			Node current = head;
			while(current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}
	
	public void rmAtPos(int position) {
		if(head == null || position <= 1) {
			rmAtFront();
		}
		else {
			Node current = head;
			for(int i = 1; i < position - 1 && current.next != null; i++) {
				current = current.next;
			}
			if(current.next != null) {
				current.next = current.next.next;
			}
		}
	}
}


















