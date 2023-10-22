// C++ program to find union and intersection of 
// two unsorted linked lists in O(n Log n) time. 
#include <bits/stdc++.h> 
using namespace std; 

/* Link list node */
struct Node { 
	int data; 
	struct Node* next; 
}; 

/* A utility function to insert a 
node at the beginning of a linked list*/
void push(struct Node** head_ref, int new_data) 
{ 
	/* allocate node */
	struct Node* new_node 
		= (struct Node*)malloc(sizeof(struct Node)); 

	/* put in the data */
	new_node->data = new_data; 

	/* link the old list of the new node */
	new_node->next = (*head_ref); 

	/* move the head to point to the new node */
	(*head_ref) = new_node; 
} 

/* UTILITY FUNCTIONS */
/* Split the nodes of the given 
list into front and back halves, 
and return the two lists 
using the reference parameters. 
If the length is odd, the 
extra node should go in the 
front list. 
		Uses the fast/slow pointer strategy. */
void FrontBackSplit(struct Node* source, 
					struct Node** frontRef, 
					struct Node** backRef) 
{ 
	struct Node* fast; 
	struct Node* slow; 
	if (source == NULL || source->next == NULL) { 
		/* length < 2 cases */
		*frontRef = source; 
		*backRef = NULL; 
	} 
	else { 
		slow = source; 
		fast = source->next; 

		/* Advance 'fast' two nodes, and 
		advance 'slow' one node */
		while (fast != NULL) { 
			fast = fast->next; 
			if (fast != NULL) { 
				slow = slow->next; 
				fast = fast->next; 
			} 
		} 

		/* 'slow' is before the midpoint in the list, 
				so split it in two at that point. */
		*frontRef = source; 
		*backRef = slow->next; 
		slow->next = NULL; 
	} 
} 

/* See https:// www.geeksforgeeks.org/?p=3622 for details 
of this function */
struct Node* SortedMerge(struct Node* a, struct Node* b) 
{ 
	struct Node* result = NULL; 

	/* Base cases */
	if (a == NULL) 
		return (b); 
	else if (b == NULL) 
		return (a); 

	/* Pick either a or b, and recur */
	if (a->data <= b->data) { 
		result = a; 
		result->next = SortedMerge(a->next, b); 
	} 
	else { 
		result = b; 
		result->next = SortedMerge(a, b->next); 
	} 
	return (result); 
} 

/* sorts the linked list by changing 
next pointers (not data) */
void mergeSort(struct Node** headRef) 
{ 
	struct Node* head = *headRef; 
	struct Node *a, *b; 

	/* Base case -- length 0 or 1 */
	if ((head == NULL) || (head->next == NULL)) 
		return; 

	/* Split head into 'a' and 'b' sublists */
	FrontBackSplit(head, &a, &b); 

	/* Recursively sort the sublists */
	mergeSort(&a); 
	mergeSort(&b); 

	/* answer = merge the two sorted lists together */
	*headRef = SortedMerge(a, b); 
} 

/* Function to get union of two 
linked lists head1 and head2 */
struct Node* getUnion(struct Node* head1, 
					struct Node* head2) 
{ 
	struct Node* result = NULL; 
	struct Node *t1 = head1, *t2 = head2; 

	// Traverse both lists and store the 
	// element in the resu1tant list 
	while (t1 != NULL && t2 != NULL) { 
		// Move to the next of first list 
		// if its element is smaller 
		if (t1->data < t2->data) { 
			push(&result, t1->data); 
			t1 = t1->next; 
		} 

		// Else move to the next of second list 
		else if (t1->data > t2->data) { 
			push(&result, t2->data); 
			t2 = t2->next; 
		} 

		// If same then move to the next node 
		// in both lists 
		else { 
			push(&result, t2->data); 
			t1 = t1->next; 
			t2 = t2->next; 
		} 
	} 

	/* Print remaining elements of the lists */
	while (t1 != NULL) { 
		push(&result, t1->data); 
		t1 = t1->next; 
	} 
	while (t2 != NULL) { 
		push(&result, t2->data); 
		t2 = t2->next; 
	} 

	return result; 
} 

/* Function to get intersection of 
two linked lists head1 and head2 */
struct Node* getIntersection(struct Node* head1, 
							struct Node* head2) 
{ 
	struct Node* result = NULL; 
	struct Node *t1 = head1, *t2 = head2; 

	// Traverse both lists and store the same element 
	// in the resu1tant list 
	while (t1 != NULL && t2 != NULL) { 
		// Move to the next of first 
		// list if smaller 
		if (t1->data < t2->data) 
			t1 = t1->next; 

		// Move to the next of second 
		// list if it is smaller 
		else if (t1->data > t2->data) 
			t2 = t2->next; 

		// If both are same 
		else { 
			// Store current element in the list 
			push(&result, t2->data); 

			// Move to the next node of both lists 
			t1 = t1->next; 
			t2 = t2->next; 
		} 
	} 

	// return the resultant list 
	return result; 
} 

/* A utility function to print a linked list*/
void printList(struct Node* node) 
{ 
	while (node != NULL) { 
		printf("%d ", node->data); 
		node = node->next; 
	} 
} 

/* Driver program to test above function*/
int main() 
{ 
	/* Start with the empty list */
	struct Node* head1 = NULL; 
	struct Node* head2 = NULL; 
	struct Node* intersection_list = NULL; 
	struct Node* union_list = NULL; 

	/*create a linked list 11->10->15->4->20 */
	push(&head1, 20); 
	push(&head1, 4); 
	push(&head1, 15); 
	push(&head1, 10); 
	push(&head1, 11); 

	/*create a linked list 8->4->2->10 */
	push(&head2, 10); 
	push(&head2, 2); 
	push(&head2, 4); 
	push(&head2, 8); 

	/* Sort the above created Linked List */
	mergeSort(&head1); 
	mergeSort(&head2); 

	intersection_list = getIntersection(head1, head2); 
	union_list = getUnion(head1, head2); 

	printf("First list is \n"); 
	printList(head1); 

	printf("\nSecond list is \n"); 
	printList(head2); 

	printf("\nIntersection list is \n"); 
	printList(intersection_list); 

	printf("\nUnion list is \n"); 
	printList(union_list); 

	return 0; 
}
