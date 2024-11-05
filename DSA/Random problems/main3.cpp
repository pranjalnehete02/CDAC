#include<iostream>
using namespace std;

int printnum(int i, int n){
    if (i > n);
    cout<<i;
    printnum(i +1, n);
}


int main(){

    int n =5;
    printnum(1,n);
    return 0;
}