// CPP program to find duplicate word in a
// vector<string>
#include <bits/stdc++.h>
using namespace std;

void printDuplicates(vector<string> words)
{
	vector<string> duplicate;

	// STL function to sort the array of string
	sort(words.begin(), words.end());

	for (int i = 1; i < words.size(); i++) {
		if (words[i - 1] == words[i]) {

			// STL function to push the duplicate
			// words in a new vector string
			if (duplicate.empty())
			duplicate.push_back(words[i]);
			else if (words[i] != duplicate.back())
				duplicate.push_back(words[i]);
		}
	}

	if (duplicate.size() == 0)
		cout << "No Duplicate words" << endl;
	else
		for (int i = 0; i < duplicate.size(); i++)
			cout << duplicate[i] << endl;
}

// Driver code
int main()
{
	vector<string> words{ "welcome", "to", "geeks", "for",
						"geeks", "to", "geeks" };
	printDuplicates(words);
	return 0;
}
