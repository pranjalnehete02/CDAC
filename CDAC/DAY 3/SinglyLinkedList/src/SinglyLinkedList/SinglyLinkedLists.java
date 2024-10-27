package SinglyLinkedList;

public class SinglyLinkedLists implements SinglyLinkedList{

	SLNode head;
	
	public SinglyLinkedLists() {
		head = null;
	}
	@Override
	public void insert(int element) {
		SLNode newnode = new SLNode(element);
		SLNode current  = head;
		
		while(current.next != null) {
			if(current.data < newnode.data) {
				current.next = newnode;
			}
		}
		
	}

	@Override
	public void delete(int element) {

		SLNode current = head;
		SLNode previous = null;
		
		if(head == null) {
			return;
		}
		while (current != null) {
			if (current.data == element) {
				if (previous == null) {
					head = current.next;
				} else {
					previous.next = current.next;
				}
			} else {
				previous = current;
			}
			current = current.next;
		}

	}

	@Override
	public void deleteAll(int element) {
		    if (head == null) {
		        return;  
		    }

		   while (head != null && head.data == element) {
		        head = head.next; 
		    }

		    if (head == null) {
		        return;
		    }

		     SLNode current = head;

		    
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
		return false;
	}

	@Override
	public void print() {
		
			SLNode current = head;
			while(current != null) {
				System.out.println(current.data + "");
				current = current.next;
			}
			System.out.println(" ");
			

	}}
