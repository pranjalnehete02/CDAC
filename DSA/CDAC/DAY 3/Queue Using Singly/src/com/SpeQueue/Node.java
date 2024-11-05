package com.SpeQueue;

//Node class for Singly Linked List
class Node {
 int data;       // The value of the node
 Node next;      // Pointer to the next node
 
 // Constructor to create a new node
 public Node(int data) {
     this.data = data;
     this.next = null;  // The next node is null by default
 }
}
