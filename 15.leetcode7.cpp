/*
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit 
integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 
64-bit integers (signed or unsigned).
*/
#include<iostream>
using namespace std;


int main(){
    int n;
    cin>>n;
    int answer = 0;

    while(n!=0){
        int digit = n%10;
        if( (answer > INT32_MAX/10) || (answer < INT32_MIN/10))
            return 0;
        answer = answer*10 + digit;
        n = n/10; 
    }

    
    cout<<answer;
    return 0;

}