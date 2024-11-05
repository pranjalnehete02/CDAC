package com.cdac.ImplementLL;

public class DoublyLinkedList {
	class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	Node head = null;
	
					//ADD
	public void addAtFront(int data) {
		Node newNode = new Node(data);
		//if list is empty
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
			
			
		}
	}
	
	//At end
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}
	
	
	public void addAtPos(int data, int position) {
		Node newNode = new Node(data);
		
		if(head == null || position <= 1) {
			addAtFront(data);
		}
		else {
			Node current = head;
			for(int i = 1; (i < position - 1) && (current.next != null); i++ ) {
				current = current.next;
			}
			newNode.next = current.next;
			if (current.next != null) {
				current.next.prev = newNode;
			}
			newNode.prev = current;
			current.next = newNode;
		}
	}
	
							//REMOVE
}
