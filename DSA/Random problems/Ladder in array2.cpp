#include <bits/stdc++.h>
using namespace std;

/* C++ Function to print leaders in an array */
void printLeaders(int arr[], int size)
{
	/* create stack to store leaders*/
	stack<int> sk;
	sk.push(arr[size-1]);
	
	for (int i = size-2; i >= 0; i--)
	{
		if(arr[i] >= sk.top())
		{		
			sk.push(arr[i]);
		}
	}
	
	/* print stack elements*/
	/* run loop till stack is not empty*/
	while(!sk.empty()){	
		cout<<sk.top()<<" ";
		sk.pop();
	}
}

/* Driver program to test above function*/
int main()
{
	int arr[] = {16, 17, 4, 3, 5, 2};
	int n = sizeof(arr)/sizeof(arr[0]);
	printLeaders(arr, n);
	return 0;
}
