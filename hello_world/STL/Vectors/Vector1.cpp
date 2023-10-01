#include<iostream>
#include<vector>

using namespace std;

int main(){

    vector<int> v;
    vector<int> :: iterator ptr;
    /*
    there is no need of auto or int
    */
    v.push_back(3);
    v.push_back(10);
    v.push_back(7);

    

    v.pop_back();

    int size = (int)v.size(); /*the output of v.size will be converted
                                to int  */

    for(int i=0; i<3; i++){
        cout<<v[i]<<" ";
    }

    v.push_back(7);

    auto a = v.begin();
    // it provides iterator which points first element of vector
    //auto is a keyword whcih automatically understand the datatype
    cout<<"first element : "<<a[0]<<endl;

    ptr = v.begin();
    cout<<"Iterator points  : "<<ptr[0]<<endl;

    /*
    Now what was auto doing, it was doing automatically 
    but what ptr doing, ptr is also doing the same 
    but we have told that what is the type of ptr
    i.e., ptr is the type of iterator and what type of iterator
    vector type of iterator 
    in that vector type what type of iterator it is?
    integer type of iterator
    */

    ptr = v.end();
    cout<<"Iterator points  : "<<ptr[0]<<endl;



    return 0;
}