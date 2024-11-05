package LinkedLists;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedLists list =  new LinkedLists();
		list.insertAtbeginning(90);
		list.insertAtend(80);
		list.insertAtposition(20, 0);
		list.deleteFromBeginning();
		list.printList(2);
		
	}
}