package doublylinkedlist;

public class DllNode {

	int data;
	DllNode next;
	DllNode previous;
	
	public DllNode() {
		data = 0;
		next = null;
		previous = null;
	}	
	public DllNode(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
	
	
}
