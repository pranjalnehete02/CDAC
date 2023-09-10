#include <bits/stdc++.h>
using namespace std;

string FindPossibleSubstrng(string inputString)
{

	for (int i = 0; i < inputString.length(); i++) {
		string subStr;
		for (int j = i; j < inputString.length(); j++) {
			subStr += inputString[j];
			cout << subStr << endl;
		}
	}
}

int main()
{
	string str = "abcd";
	FindPossibleSubstrng(str);
	return 0;
}