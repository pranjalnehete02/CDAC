#include<iostream>
using namespace std;

int main(){
    int x = 0;
    cout<<"Enter the value of x ";
    cin>>x;

    int arr[x];
    

    for(int i = 0; i<x; i++){
        cout<<"Enter the values of xi ";
        cin>>arr[i];
    }

    cout<<"Your entered values are :"<<endl;

    for(int i = 0; i<x; i++){
        
        cout<<arr[i]<<endl;
    }

    int y;
    int count = 0;
    cout<<"Enter the value of y ";
    cin>>y;

    for(int i = 0;i<x; i++){
        if(arr[i] % y == 0){
            count++;
        }
    }

    cout<<"Number of x divisible by y are: "<<count;


    return 0;
}
