//C++ program to implement above approach

#include <iostream>

class Node {
public:
	int data;
	Node* next;

	Node(int val) : data(val), next(nullptr) {}
};

class LinkedList {
public:
	Node* head;

	LinkedList() : head(nullptr) {}

	// Function to insert a node at the end of the linked list
	void append(int data) {
		Node* temp = new Node(data);
		if (head == nullptr) {
			head = temp;
		} else {
			Node* p = head;
			while (p->next != nullptr) {
				p = p->next;
			}
			p->next = temp;
		}
	}

	// Function to find the middle node of the linked list
	Node* get_mid(Node* head) {
		if (head == nullptr) {
			return head;
		}
		Node* slow = head;
		Node* fast = head;
		while (fast->next != nullptr && fast->next->next != nullptr) {
			slow = slow->next;
			fast = fast->next->next;
		}
		return slow;
	}

	// Recursive method to merge two halves after sorting
	Node* merge(Node* l, Node* r) {
		if (l == nullptr) return r;
		if (r == nullptr) return l;

		Node* result;
		if (l->data <= r->data) {
			result = l;
			result->next = merge(l->next, r);
		} else {
			result = r;
			result->next = merge(l, r->next);
		}
		return result;
	}

	// Recursive method to divide the list into two halves until 1 node left
	Node* merge_sort(Node* head) {
		if (head == nullptr || head->next == nullptr) {
			return head;
		}
		Node* mid = get_mid(head);
		Node* next_to_mid = mid->next;
		mid->next = nullptr;
		Node* left = merge_sort(head);
		Node* right = merge_sort(next_to_mid);
		Node* sorted_merge = merge(left, right);
		return sorted_merge;
	}

	// Function to print the list elements
	void display() {
		Node* p = head;
		while (p != nullptr) {
			std::cout << p->data << " ";
			p = p->next;
		}
		std::cout << std::endl;
	}
};

// Function to get the difference list
LinkedList get_difference(Node* p1, Node* p2) {
	LinkedList difference_list;
	// Scan the lists
	while (p1 != nullptr && p2 != nullptr) {
		// Condition to check if the data of both pointers are the same, then move ahead
		if (p2->data == p1->data) {
			p1 = p1->next;
			p2 = p2->next;
		} else if (p2->data < p1->data) { // Condition to check if the data of the second pointer is smaller than the first, then move the second pointer ahead
			p2 = p2->next;
		} else { // Condition when the data of the first pointer is greater than the second, then append into the difference list and move
			difference_list.append(p1->data);
			p1 = p1->next;
		}
	}

	// If the end of list2 is reached, there may be some nodes in List 1 left to be scanned,
	// they all will be inserted in the difference list
	while (p1 != nullptr) {
		difference_list.append(p1->data);
		p1 = p1->next;
	}

	return difference_list;
}

int main() {
	// Linked List 1
	LinkedList list1;
	list1.append(2);
	list1.append(6);
	list1.append(8);
	list1.append(1);

	// Linked List 2
	LinkedList list2;
	list2.append(4);
	list2.append(1);
	list2.append(9);

	// Sort both linked lists
	list1.head = list1.merge_sort(list1.head);
	list2.head = list2.merge_sort(list2.head);

	// Get the difference list
	LinkedList result = get_difference(list1.head, list2.head);

	if (result.head) {
		result.display();
	} else {
		std::cout << "Lists are equal" << std::endl;
	}

	return 0;
}
