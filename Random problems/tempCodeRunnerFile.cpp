#include<iostream>
using namespace std;

int main(){

    int x;
    cout<<"Enter the amount "<<endl;
    cin>>x;
    
    int rem_bal;
    if(x%5 == 0){
        if(x < 2000){
            rem_bal = 2000 - x - 0.5;
            cout<<rem_bal<<endl;

        }
    }

    return 0;
}