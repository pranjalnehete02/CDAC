
//it's the program to reverse the string using stack data structure


#include<iostream>
#include<stack>

using namespace std;

int main(){

    stack<char> charStack;
    string input, reversed;

    cout<<"Enter a string  :";
    cin>>input;

//here we save the inputed stack items in the charStack
    for(char c : input){
        charStack.push(c);
    }

//now we pop the every item of charStack and saved it into reversed named string.
//the steps will be first we only append the top item using top functon and save it into the reverse string
//then we pop that top element. 
    while(!charStack.empty()){
        reversed += charStack.top();
        charStack.pop();
    }

    cout<<"Reversed string : "<<reversed<<endl;



    return 0;
}