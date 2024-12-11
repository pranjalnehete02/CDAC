#include<iostream>
#include<stack>
#include<vector>
#include<utility>

using namespace std;

string removetheduplicate(string s, int k){
    vector<pair<int, int>> st;
    
    //inserting the elements in vector pair
    //the condidtion for inserting is that 
    //       1.The stack should be empty  
    //                  OR
    //       2.The ele which is being inserted should NOT match the previous one because 
    //         if get matched the we have to check for it's previous also and that another function .
    for (auto c : s){
        if(st.size() == 0 || st.back().first != c){
            st.push_back({c, 1});
        }
        else{
            //and if that element is matched now we're incrementing the count of that element 
            //by incrementing the second value i.e., 
            //we are using vector pair so <{first, second}> here first -> value   &  second-> frequency
                st.back().second++;
            }
        //now we are checking if that second value is equal to k 
        //the removing the element
        if(st.back().second == k){
            st.pop_back();
        }
    }

    //now we are left with a vector
    //we've to return that in  a value frequecncy mannner
    string res;

    for(auto x : st){
        res.append(x.second, x.first);
    }

    return res;

}




int main(){

    return 0;
}