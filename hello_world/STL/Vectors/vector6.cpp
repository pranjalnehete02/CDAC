//              SWAPPING OF TWO VECTORS

#include<iostream>
#include<vector>

using namespace std;

int main(){

    vector<int> v1, v2;

    v1.push_back(23);
    v1.push_back(65);
    v1.push_back(-2);
    v2.push_back(87);
    v2.push_back(36);


//printing elements
    for(auto ptr = v1.begin(); ptr != v1.end(); ptr++){
        cout<<*ptr<<" ";
    }

    cout<<endl;

    for(auto ptr = v2.begin(); ptr != v2.end(); ptr++){
        cout<<*ptr<<" ";
    }
    cout<<endl;




    v1.swap(v2);


//printing elements

    for(auto ptr = v1.begin(); ptr != v1.end(); ptr++){
        cout<<*ptr<<" ";
    }

    cout<<endl;

    for(auto ptr = v2.begin(); ptr != v2.end(); ptr++){
        cout<<*ptr<<" ";
    }
    cout<<endl;

}