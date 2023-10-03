#include<iostream>
#include<stack>
#include<vector>
using namespace std;

int next(int price){
    stack<pair<int, int>>st;
    int span = 1;

    while(!st.empty() && st.top().first <= price){
        span = span + st.top().second;
        st.pop();
    }

    st.push({price, span});
    return span;
}



int main(){

    int arr[] = {100, 80, 60, 70, 60, 75, 85};



}