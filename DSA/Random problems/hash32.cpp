// C++ program to find the maximum distance between 
// two equal elements 
#include <bits/stdc++.h> 

// function to find the maximum distance 
int maxDistance(int arr[], int n) 
{ 

	// initialize the maxD to -1 
	int maxD = -1; 
	for (int i = 0; i < n - 1; i++) 
		for (int j = i + 1; j < n; j++) 

			// check if two elements are equal 
			if (arr[i] == arr[j]) { 
				// if yes then calculate the distance and 
				// update maxD 
				int temp = abs(j - i); 
				maxD = maxD > temp ? maxD : temp; 
			} 
	// return maximum distance 
	return maxD; 
} 
// Driver code 
int main() 
{ 
	int Arr[] = { 1, 2, 4, 1, 3, 4, 2, 5, 6, 5 }; 
	printf("Maximum distance between two occurrences of "
		"same element in array:%d", 
		maxDistance(Arr, 10)); 
	return 0; 
}
