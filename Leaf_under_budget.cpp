// C++ program to calculate the maximum number of leaf
// nodes that can be visited within the given budget
#include <bits/stdc++.h>
using namespace std;

// struct that represents a node of the tree
struct Node {
	Node* left;
	Node* right;
	int data;

	Node(int key)
	{
		data = key;
		this->left = nullptr;
		this->right = nullptr;
	}
};

Node* newNode(int key)
{
	Node* temp = new Node(key);
	return temp;
}

// Priority queue to store the levels
// of all the leaf nodes
vector<int> pq;

// Level order traversal of the binary tree
void levelOrder(Node* root)
{
	vector<Node*> q;
	int len, level = 0;
	Node* temp;

	// If tree is empty
	if (root == nullptr)
		return;

	q.push_back(root);

	while (true) {

		len = q.size();
		if (len == 0)
			break;
		level++;
		while (len > 0) {

			temp = q[0];
			q.erase(q.begin());

			// If left child exists
			if (temp->left != nullptr)
				q.push_back(temp->left);

			// If right child exists
			if (temp->right != nullptr)
				q.push_back(temp->right);

			// If node is a leaf node
			if (temp->left == nullptr && temp->right == nullptr)
			{
				pq.push_back(level);
				sort(pq.begin(), pq.end());
				reverse(pq.begin(), pq.end());
			}
			len--;
		}
	}
}

// Function to calculate the maximum number of leaf nodes
// that can be visited within the given budget
int countLeafNodes(Node* root, int budget)
{
	levelOrder(root);
	int val;

	// Variable to store the count of
	// number of leaf nodes possible to visit
	// within the given budget
	int count = 0;

	while (pq.size() != 0) {

		// Removing element from
		// min priority queue one by one
		val = pq[0];
		pq.erase(pq.begin());

		// If current val is under budget, the
		// node can be visited
		// Update the budget afterwards
		if (val <= budget) {
			count++;
			budget -= val;
		}
		else
			break;
	}
	return count;
}

// Driver code
int main()
{
	Node* root = newNode(10);
	root->left = newNode(8);
	root->right = newNode(15);
	root->left->left = newNode(3);
	root->left->left->right = newNode(13);
	root->right->left = newNode(11);
	root->right->right = newNode(18);

	int budget = 8;

	cout << countLeafNodes(root, budget);

	return 0;
}

// This code is contributed by decode2207.
