package com.SpLinkedList;

//Sorted Singly Linked List implementation
public class SortedSinglyLinkedList {

 private Node head;  // Points to the first node of the list

 // Constructor to initialize an empty linked list
 public SortedSinglyLinkedList() {
     this.head = null;  // Initially, the list is empty
 }

 // Delete the first occurrence of the specified element
 public void delete(int element) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     // Case 1: If the head contains the element
     if (head.data == element) {
         head = head.next;  // Move head to the next node
         System.out.println("Deleted element: " + element);
         return;
     }

     // Case 2: Traverse to find the element in the list
     Node current = head;
     while (current.next != null && current.next.data != element) {
         current = current.next;
     }

     // If element is found, delete it
     if (current.next != null) {
         current.next = current.next.next;
         System.out.println("Deleted element: " + element);
     } else {
         System.out.println("Element " + element + " not found.");
     }
 }

 // Delete all occurrences of the specified element
 public void deleteAll(int element) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     // Case 1: If the head contains the element
     while (head != null && head.data == element) {
         head = head.next;  // Move head to the next node
     }

     // Case 2: Traverse the list to delete all occurrences of the element
     Node current = head;
     while (current != null && current.next != null) {
         if (current.next.data == element) {
             current.next = current.next.next;  // Delete the node
         } else {
             current = current.next;  // Move to the next node
         }
     }

     System.out.println("Deleted all occurrences of element: " + element);
 }

 // Search for the specified element in the list
 public boolean search(int element) {
     Node current = head;  // Start from the head of the list
     while (current != null) {
         if (current.data == element) {
             return true;  // Element found
         }
         current = current.next;  // Move to the next node
     }
     return false;  // Element not found
 }

 // Helper function to insert elements in sorted order
 public void insert(int element) {
     Node newNode = new Node(element);  // Create a new node
     if (head == null || head.data >= element) {
         newNode.next = head;  // Insert at the beginning
         head = newNode;
     } else {
         Node current = head;
         while (current.next != null && current.next.data < element) {
             current = current.next;
         }
         newNode.next = current.next;
         current.next = newNode;  // Insert at the correct position
     }
 }

 // Helper function to display the list
 public void display() {
     Node current = head;
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }
     System.out.println("null");
 }
}
