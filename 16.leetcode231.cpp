/* 
Given an integer n, return true if it is a power of two. 
Otherwise, return false.
An integer n is a power of two, if there exists an integer
 x such that n == 2x.
*/

#include<iostream>
#include<math.h>
using namespace std;


int main(){
    int n;
    cin>>n;

    int ans=1;

    for(int i = 0; i<=30; i++){
        ans = pow(2,i);
    }

    if(ans == n)
        cout<<"true";
    else 
        cout<<"False";


    return 0;
}