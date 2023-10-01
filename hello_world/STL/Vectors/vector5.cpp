//                  v.insert()
//                  v.erase()
//                  v.clear()


#include<iostream>
#include<vector>

using namespace std;

int main(){

    vector<int> v;

    v.push_back(1);
    v.push_back(2);
    v.push_back(3);
    v.push_back(4);
    v.push_back(5);
    v.push_back(6);

    v.insert(v.begin(), -3);

    for(auto ptr = v.begin(); ptr != v.end(); ptr++){
        cout<<*ptr<<" ";
    }

    cout<<endl;

    v.insert(v.begin()+3, -9);

    v.erase(v.begin() + 4);
    //3rd element will be removed

    for(auto ptr = v.begin(); ptr != v.end(); ptr++){
        cout<<*ptr<<" ";
    }


    v.clear();
}