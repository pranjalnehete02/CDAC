#include<iostream>
#include<stack>

using namespace std;

// int minStackElem(stack<int>s){    
// }

// int main(){
//     stack<int> st;
//     st.push(-2);
//     st.push(0);
//     st.push(-3);
//     return 0;
// }


stack<int>st, s2;
// MinStack(){


// }

void push(int val){
    if(s2.empty()  ||  val <= s2.top()){
        s2.push(val);
    }

    st.push(val);
}

void pop(){
    if(st.top() == s2.top()){
        s2.pop();
    }
    st.pop();
}

void top(){
    return st.top();
}

void minstack(){
    return s2.top();
}

int main(){


}