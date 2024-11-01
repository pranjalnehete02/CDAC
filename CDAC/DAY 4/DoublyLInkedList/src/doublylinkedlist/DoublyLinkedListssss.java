package doublylinkedlist;

public class DoublyLinkedListssss implements DoublyLinkedListss {

	DllNode head;
	DllNode tail;
	
	public DoublyLinkedListssss() {
		head = null;
		tail = null;
	}
	@Override
	public void addAtfirst(int element) {
	//	DllNode current = head;
		//DllNode previous = null;
		DllNode newNode = new DllNode(element);
		
		if(head == null) {
			tail = newNode;
		}
		else {
			
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		
		
	}

	@Override
	public void addAtend(int element) {
		DllNode newNode = new DllNode(element);
		DllNode current = head;
		if(head == null) {
			head = newNode;
		}
		
		while(current.next != null) {
			current = current.next;
		}
		
			current.next = newNode;
			newNode.previous = current;
		
		
	}
	@Override
	public void deletefirstNode() {
		
	}

}
