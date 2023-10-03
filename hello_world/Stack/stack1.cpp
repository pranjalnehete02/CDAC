/*remove duplicate
we have to remove the duplicates of the consecutive elements in the STRING

1.find the size of string
2.Initialize the stack with string
3.Loop(while)
    conditions :     (empty || top != current_ele)
4.Print the string
5.Reverse the string
6. Return the string




*/
#include<iostream>
#include<stack>

using namespace std;

string removeDuplicates(string s){
    int n = s.size(), i= 0;
    stack<char> str;

    while(i<n){
        if(str.empty() || str.top() != s[i]){
            str.push(s[i]);
        }
        else
            str.pop();
        i++;
    }

    string ans = "";
    while(!str.empty()){
        char ele = str.top();
        str.pop();

        ans =  ans + ele;
    }

   // reverse(ans.begin(), ans.end());
   return ans;
}


int main(){

    string s = "abbaca";

    removeDuplicates(s);

    return 0;
}