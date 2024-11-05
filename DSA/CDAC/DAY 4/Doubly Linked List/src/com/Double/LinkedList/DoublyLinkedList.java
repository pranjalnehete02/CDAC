package com.Double.LinkedList;

//Doubly Linked List implementation
public class DoublyLinkedList {

 private Node head;  // Points to the first node of the list
 private Node tail;  // Points to the last node of the list

 // Constructor to initialize an empty doubly linked list
 public DoublyLinkedList() {
     this.head = null;
     this.tail = null;
 }

 // Add a specified element at the end of the list
 public void addAtRear(int element) {
     Node newNode = new Node(element);  // Create a new node with the given element

     // Case 1: If the list is empty
     if (head == null) {
         head = newNode;  // Both head and tail point to the new node
         tail = newNode;
     } else {
         // Case 2: Add new node at the rear (end)
         tail.next = newNode;  // Link the last node to the new node
         newNode.prev = tail;  // Set the new node's previous to the old tail
         tail = newNode;  // Update the tail to point to the new node
     }
     System.out.println("Added element " + element + " at the rear.");
 }

 // Remove the first node and return its value
 public int deleteFirstNode() throws Exception {
     // Case 1: If the list is empty, throw an exception
     if (head == null) {
         throw new Exception("List is empty, cannot delete.");
     }

     // Case 2: Remove the head and return its value
     int value = head.data;  // Store the data of the head
     head = head.next;  // Move the head to the next node

     // If the list becomes empty after deletion, reset tail to null
     if (head == null) {
         tail = null;
     } else {
         head.prev = null;  // The new head's previous should be null
     }

     System.out.println("Deleted first node with value: " + value);
     return value;
 }

 // Helper function to display the list from head to tail
 public void display() {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     Node current = head;
     while (current != null) {
         System.out.print(current.data + " <-> ");
         current = current.next;
     }
     System.out.println("null");
 }
}
