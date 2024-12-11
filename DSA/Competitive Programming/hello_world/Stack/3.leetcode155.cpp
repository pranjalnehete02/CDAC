#include <bits/stdc++.h>
using namespace std;
class MinStack {
public:
    stack<int> st,mn;
    
    void push(int x) 
    {
        if(st.empty() || x<=mn.top())
            mn.push(x);
        st.push(x);
    }
    
    void pop() 
    {
        if(st.top()==mn.top()) 
            mn.pop();
        st.pop();
    }
    
    int top() 
    {
        return st.top();
    }
    
    int getMin() 
    {
        return mn.top();
    }
};
int main() 
{
    MinStack* minStack = new MinStack();
    minStack->push(-2);
    minStack->push(0);
    minStack->push(-3);
    int param1 = minStack->getMin(); 
    minStack->pop();
    int param2 = minStack->top();   
    int param3 = minStack->getMin(); 
    
    cout<<param1<<endl;
    cout<<param2<<endl;
    cout<<param3<<endl;
    
    return 0; 
}