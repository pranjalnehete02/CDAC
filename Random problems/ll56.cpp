// C++ program to implement
// the above approach

#include <bits/stdc++.h>
using namespace std;

// Structure of a Node
class node {
public:
	int data;
	node* next;
	node(int d)
	{
		data = d;
		next = NULL;
	}
};

// Function to insert the node
// at the head of the linkedlist
void insert_at_head(node*& head, int data)
{
	node* n = new node(data);
	n->next = head;
	head = n;
	return;
}

// Function to print the linked list
void print(node* head)
{
	while (head != NULL) {
		cout << head->data << " ";
		head = head->next;
	}
	cout << endl;
	return;
}

// Function to merge the odd and
// even positioned nodes of two
// given linked lists alternately
node* merge_alternate(node* head1, node* head2)
{
	// Traverse from the second
	// node of second linked list
	if (head2)
		head2 = head2->next;

	// Stores the head of
	// the resultant list
	node* head3 = NULL;

	// Stores the current node
	node* cur = NULL;

	// Store the first node of
	// first list in the result
	if (head1)
		head3 = head1;

	// Otherwise
	else
		head3 = head2;

	// Traverse until end of a
	// one of the list is reached
	while (head1 != NULL && head2 != NULL) {

		// If there is a previous node then
		// connect that with the current node
		if (cur)
			cur->next = head1;

		// Update the current node
		cur = head1;

		// If next odd node exists
		if (head1->next != NULL)

			// Store the next odd node
			head1 = head1->next->next;

		// Otherwise
		else

			// Reach end of list
			head1 = NULL;

		// Connect the first node
		// with the second node
		cur->next = head2;

		// Update the current node
		cur = head2;

		// If next even node exists
		if (head2->next != NULL)

			// Store the next even node
			head2 = head2->next->next;

		// Otherwise
		else

			// Reach the end of the list
			head2 = NULL;
	}

	// If end of the second
	// list has been reached
	while (head1 != NULL) {

		// Connect with the
		// previous node
		if (cur)
			cur->next = head1;

		// Update the current node
		cur = head1;

		// If next odd node exists
		if (head1->next != NULL)

			// Store the next odd node
			head1 = head1->next->next;

		// Otherwise
		else

			// Reach end of list
			head1 = NULL;
	}

	// If end of second list
	// has been reached
	while (head2 != NULL) {

		// Connect with the
		// previous node
		if (cur)
			cur->next = head2;

		// Update the current node
		cur = head2;

		// If next even node exists
		if (head2->next != NULL)

			// Store the next odd node
			head2 = head2->next->next;

		// Otherwise
		else

			// Reach end of list
			head2 = NULL;
	}

	// End of the resultant list
	if (cur)
		cur->next = NULL;

	// Returning the head of
	// the resultant node
	return head3;
}

// Driver Code
int main()
{
	node *head1 = NULL, *head2 = NULL;

	// Create linked list
	insert_at_head(head1, 6);
	insert_at_head(head1, 19);
	insert_at_head(head1, 13);
	insert_at_head(head1, 12);
	insert_at_head(head1, 10);
	insert_at_head(head1, 5);
	insert_at_head(head1, 1);

	insert_at_head(head2, 9);
	insert_at_head(head2, 7);
	insert_at_head(head2, 2);

	// Merging the linked lists
	head1 = merge_alternate(head1, head2);

	print(head1);
}
