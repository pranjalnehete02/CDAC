#include<iostream>
#include<algorithm>
using namespace std;

int main(){

    int a[10] = {1, 5, 8, 9, 6, 7, 3, 4, 2, 0} ;
    sort(a, a+10);
    for(int i = 0; i < 10; i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
}