//                  v.assign()
//                  v.empty()
//                  v.max_size()


#include<iostream>
#include<vector>

using namespace std;

int main(){

    vector<int> v;

    v.assign(6,3);
    //this assign function will assign 3, 6 times in array.

    cout<<"Vector is empty or not ? "<<v.empty()<<endl;

    for(auto ptr = v.begin(); ptr != v.end(); ptr++){
        cout<<*ptr<<" "<<endl;
    }


    //maximum size of the vector 
    cout<<"Max number of elements stored in the vector v : "<<v.max_size()<<endl;



}