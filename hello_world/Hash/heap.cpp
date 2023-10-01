// C++ program to find the only repeating
// element in an array where elements are
// from 1 to N-1.
#include <bits/stdc++.h>
using namespace std;

int findRepeating(int arr[], int N)
{
	for (int i = 0; i < N; i++) {
		for (int j = i + 1; j < N; j++) {
			if (arr[i] == arr[j])
				return arr[i];
		}
	}
}

// Driver's code
int main()
{
	int arr[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
	int N = sizeof(arr) / sizeof(arr[0]);

	// Function call
	cout << findRepeating(arr, N);
	return 0;
}
// This code is added by Arpit Jain
