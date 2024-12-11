// C++ program to reverse a string using stack
#include <bits/stdc++.h>
using namespace std;

void recursiveReverse(string &str)
{
stack<char> st;
for (int i=0; i<str.length(); i++)
	st.push(str[i]);

for (int i=0; i<str.length(); i++) {
	str[i] = st.top();
	st.pop();
}	
}

// Driver program
int main()
{
	string str = "geeksforgeeks";
	recursiveReverse(str);
	cout << str;
	return 0;
}
