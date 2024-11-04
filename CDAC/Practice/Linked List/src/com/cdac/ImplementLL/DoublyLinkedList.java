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
}
