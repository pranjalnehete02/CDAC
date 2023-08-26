// C++ program to find the longest substring
// with k unique characters in a given string

#include <bits/stdc++.h>
using namespace std;

// Function to calculate length of
// longest substring with k characters
void longestKSubstr(string s, int k)
{

	int n = s.length();
	int answer = -1;
	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j <= n; j++) {
			unordered_set<char> distinct(s.begin() + i,
										s.begin() + j);
			if (distinct.size() == k) {
				answer = max(answer, j - i);
			}
		}
	}

	cout << answer;
}

// Driver function
int main()
{
	string s = "aabacbebebe";
	int k = 3;

	// Function Call
	longestKSubstr(s, k);
	return 0;
}
