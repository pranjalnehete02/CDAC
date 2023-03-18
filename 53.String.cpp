#include<iostream>
#include<string>    //for the declearation of string class
using namespace std;

int main(){

    string str;

    //takes the input and stores in str string
    getline(cin, str);

    cout<<str<<endl;

    //inserting a character
    str.push_back('s');

    cout<<str<<endl;

    str.pop_back();

    cout<<str<<endl;

    return 0;
}