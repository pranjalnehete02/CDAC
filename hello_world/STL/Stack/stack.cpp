//                                  s.empty()
//                                  s.top()
//                                  s.pop() 
//                                  s.size()

#include<iostream>
#include<stack>

using namespace std;

void printElementOfStack(stack<int> s){
    while(! s.empty()){
        cout<<s.top()<<endl;
        s.pop();
    }
}

int main(){

    stack<int> s;

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);

    cout<<s.empty()<<endl;
    cout<<s.size()<<endl;
    cout<<endl;

    printElementOfStack(s);

}