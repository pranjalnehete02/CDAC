#include<iostream>
#include<string>
using namespace std;

int main(){

    string str = "geeks are from Jalgaon";

    str.resize(10);

    cout<<str<<endl;

    cout<<str.capacity()<<endl;

    cout<<str.length()<<endl;

    str.shrink_to_fit();

    //Decreases the capacity of string
    cout<<str.capacity()<<endl;

    return 0;
}