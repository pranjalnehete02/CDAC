package LinkedLists;

class Node{
	int data;
	Node next;
	
	Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

public class LinkedLists implements linkedlistss{

	Node head;
	LinkedLists() {
		head = null;
	}
	
	@Override
	public void insertAtbeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;	
		
	}

	@Override
	public void insertAtend(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}
	

	@Override
	public void insertAtposition(int data, int position) {
		if(position == 0) {
			insertAtbeginning(data);
			return;
		}
		
		Node newNode = new Node(data);
		Node current = head;
		
		for(int i=0; i<position ; i++) {
			
			current = current.next;
		}
		if(current == null) {
			System.out.println("Position out of bound");
			return;
		}
		newNode.next =  current.next;
		current.next = newNode;		
	}

	@Override
	public void deleteFromBeginning() {
		if(head!=null) {
			head = head.next;
		}		
	}

	@Override
	public void deleteFromEnd() {
		
	}

	@Override
	public void deleteFromPosition(int position) {
		if(head == null) {
			return;
		}
		if(position == 0) {
			head = head.next;
			return;
		}
		Node current = head;
		Node previous = null;
		
		for(int i=0; i<position - 1 && current !=null; i++) {
			previous = current;
			current = current.next;
		}
		
		if(current == null) {
			System.out.println("Element out of bound");
		}
		previous.next = current.next;
	}

	@Override
	public void printList(int position) {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + "");
			current = current.next;
		}
		System.out.println(" ");
		
	}

}