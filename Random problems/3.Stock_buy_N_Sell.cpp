#include<bits/stdc++.h>
#include<iostream>
using namespace std;

int main(){

    int arr[] = {7,1,5,3,6,4};
    int x;
    int y; 


    for(int i = 0; i < 5; i++){
        if(x < arr[i]){
            x = arr[i];
        }
    }

    for(int i = 1; i < 6; i++){
        if(y > arr[i]){
            y = arr[i];
        }
    }

    cout<<x<<" "<<y<<" ";

    return 0;
}