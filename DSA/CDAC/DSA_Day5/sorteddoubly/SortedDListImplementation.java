package com.cdac.acts.sorteddoubly;

import com.cdac.acts.doubly.DoublyList;

public class SortedDListImplementation implements SortedDList{

	class Node{
		Node prev;
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	private Node head;
	private Node tail;
	
	public SortedDListImplementation()
	{
		this.head = null;
		this.tail = null;
	}
	@Override
	public void insert(int element) {
		Node newNode = new Node(element);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		Node current = head;
		while (current != null) {
			if (current.data > element) {
				break;
			}
			current = current.next;
		}
		
		if (current == head) {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}
		
		if (current == null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			return;
		}
		
		newNode.next = current;
		newNode.prev = current.prev;
		current.prev.next = newNode;
		current.prev = newNode;
	}
	
	@Override
	public void print() {
		if(head == null)
		{
			throw new IllegalStateException("List is Empty");
		}
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data + "\t");
			current = current.next;
		}
	}
	
	@Override
	public void delete(int element) {
		if(head == null)
		{
			throw new IllegalStateException("List is Empty");			
		}
		if(head.data == element)
		{
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null)
		{
			if(current.next.data == element)
			{
				current.next = current.next.next;
				return ;
			}
			current = current.next;
		}
		
	}
	
	@Override
	public void deleteAll(int element) {
		while (head != null && head.data == element) {
	        head = head.next;
	    }

	    Node current = head;
	    while (current != null && current.next != null) {
	        if (current.next.data == element) {
	            current.next = current.next.next;
	        } else {
	            current = current.next;
	        }
	    }
	}
	
	@Override
	public boolean search(int element) {
		if(head == null)
		{
			throw new IllegalStateException("List is Empty");
		}
		Node current = head;
		while(current != null)
		{
			if(current.data == element)
			{
				System.out.println("Element Found!!");
				return true;
			}
			current = current.next;
		}
		System.out.println("Element Not Found!!");
		return false;
		
	}

}
