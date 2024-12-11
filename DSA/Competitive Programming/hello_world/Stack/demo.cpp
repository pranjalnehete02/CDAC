// Brute force C++ program to calculate the
// maximum absolute difference of an array.
#include <bits/stdc++.h>
using namespace std;

int calculateDiff(int i, int j, int arr[])
{
	// Utility function to calculate
	// the value of absolute difference
	// for the pair (i, j).
	return abs(arr[i] - arr[j]) + abs(i - j);
}

// Function to return maximum absolute
// difference in brute force.
int maxDistance(int arr[], int n)
{
	// Variable for storing the maximum
	// absolute distance throughout the
	// traversal of loops.
	int result = 0;

	// Iterate through all pairs.
	for (int i = 0; i < n; i++) {
		for (int j = i; j < n; j++) {

			// If the absolute difference of
			// current pair (i, j) is greater
			// than the maximum difference
			// calculated till now, update
			// the value of result.
			if (calculateDiff(i, j, arr) > result)
				result = calculateDiff(i, j, arr);
		}
	}
	return result;
}

// Driver program to test the above function.
int main()
{
	int arr[] = { -70, -64, -6, -56, 64,
				61, -57, 16, 48, -98 };

	int n = sizeof(arr) / sizeof(arr[0]);

	cout << maxDistance(arr, n) << endl;

	return 0;
}
