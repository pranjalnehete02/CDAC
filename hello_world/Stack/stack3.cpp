#include<iostream>
#include<stack>

using namespace std;


bool isValid(string s){
    stack<int> st;
    for(auto c: s){
        if(st.empty()){
            st.push(c);
        }
        else if( (st.top() == '(' && c == ')') ||
                 (st.top() == '{' && c == '}') ||
                 (st.top() == '[' && c == ']') ){
                    st.pop();
                 }
        else{
            st.push(c);
        }
    }
    if(st.size() == 0){
        return true;
    }
    else{
        return false;
    }
}

int main(){

    string str = "()({[}})";

    return 0;
}