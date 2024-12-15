/*

Problem
Your task is very simple: given two integers A and B, 
write a program to add these two numbers and output the sum.

Input
3
1 2
100 200
10 40

Output
3
300
50

*/

#include<iostream>
using namespace std;

int main(){

    int T; cin>>T;
    for(int i=0; i<T; i++){
        int a,b; cin>>a>>b;
        cout<<a+b<<endl;
    }

    return 0;
}