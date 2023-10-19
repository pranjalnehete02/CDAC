// C++ implementation of the approach
#include<bits/stdc++.h>
using namespace std;

struct Node
{
	int data;
	Node *next;

	Node(int data)
	{
		this->data = data;
		this->next = NULL;
	}
};

void printList(Node *);

// Function to split the given linked list
// into ratio of p and q
void splitAndPrint(Node *head, int p, int q)
{
int n = 0;
Node *temp;
temp = head;

// Find the length of the list
while (temp != NULL)
{
	n += 1;
	temp = temp->next;
}

// If ration exceeds the actual length
if (p + q > n)
{
	cout << "-1" << endl;
	return;
}
temp = head;
while (p > 1)
{
	temp = temp->next;
	p -= 1;
}

// second head node after splitting
Node *head2 = temp->next;
temp->next = NULL;

// Print first linked list
printList(head);
cout << endl;

// Print second linked list
printList(head2);
}

// Function to print the nodes
// of the linked list
void printList(Node* head)
{
if (head == NULL)
	return;
cout << head->data << " ";
printList(head->next);
}

// Driver code
int main()
{
Node* head = new Node(1);
head->next = new Node(3);
head->next->next = new Node(5);
head->next->next->next = new Node(6);
head->next->next->next->next = new Node(7);
head->next->next->next->next->next = new Node(2);

int p = 2, q = 4;
splitAndPrint(head, p, q);
}

// This code is contributed by rutvik_56.
