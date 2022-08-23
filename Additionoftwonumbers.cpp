//You don't need to read input or print anything.
// Your task is to complete the function addition() 
//which takes two numbers A and B and returns the sum of A and B.


#include<bits/stdc++.h> 
using namespace std; 

class Solution{   
public:
    int addition(int A, int B){
        return(A+B);
    }
};

int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int A, B;
        cin >> A >> B;
        Solution ob;
        cout << ob.addition(A,B) << endl;
    }
    return 0; 
} 