#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    class Solution{
    public:
        {vector<int> nextGreaterElement(vector<int> num1, vector<int> num2);
            unordered_map<int,int>umap;
            stack<int>st;
            int n = num2.size();
            for(int i= n-1; i>=0; i--){
                while(!st.empty() && st.top <= ele){
                    st.pop();
                }
                int res = (st.empty()) ? -1 : st.pop();
                umap.insert({ele, res});
                st.push(ele);
            }

            vector<int> ans;
            for(auto x : num1){
                ans.push_back(umap[x]);
            }

            return ans;
            }

    };

    return 0;
}



/*

the problem is basically about to find the next greater number 
so,
i/p = nums1
nums1={5, 15,10,8, 6, 12, 9, 18}
O/p  ={15,18,12,12,12,18, 18,-1}

now maps/binds the 5->15, 
             15->18,
             10->12,
             8->12,
             .
             .
             .
             and so on..till
             18-> -1


Logic:
            for(int i= n-1; i>=0; i--){
                while( st.top <= ele  &&    !st.empty() ){
                    st.pop();
                }
                int res = (st.empty()) ? -1 : st.pop();
                umap.insert({ele, res});
                st.push(ele);
            }


*/