#include<iostream>
using namespace std;

int area(int a){
    return (3.14*a*a);
}

int main(){

    int a;
    cout<<"Enter the value of r";
    cin>>a;
    cout<<area(a);
    return 0;
}