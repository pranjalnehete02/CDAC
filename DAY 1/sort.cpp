#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

void show(int a[11]){

    for(int i = 0; i < 11; i++){
        cout<<a[i]<<"  ";
    }

}

int main(){

    int a[11] = {9, 8, 1, 2, 7, 4, 0, 5, 3, 6};

    show(a);

    sort(a, a+10);
    
    cout<<endl;
    cout<<endl;

    show(a);




    vector<int> v;

    v.push_back(-2);
    v.push_back(51);
    v.push_back(90);
    v.push_back(-5);
    v.push_back(23);
    v.push_back(1);
    v.push_back(-67);
    // for(int i = 0; i <(int)v.size(); i++){
    //     cin>>v[i];
    // }

    sort(v.begin(), v.end());
    for(int i = 0; i <(int)v.size(); i++){
        cout<<v[i]<<"  "<<endl;
    }



















    cout<<endl;
    cout<<endl;
    cout<<endl;
    cout<<endl;
    cout<<endl;

    return 0;

}