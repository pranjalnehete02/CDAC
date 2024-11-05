package DoublyLinkedList;


//Node class for Doubly Linked List
class Node {
int data;       // The value of the node
Node next;      // Pointer to the next node
Node prev;      // Pointer to the previous node

// Constructor to create a new node
public Node(int data) {
   this.data = data;
   this.next = null;  // The next node is null by default
   this.prev = null;  // The previous node is null by default
}
}