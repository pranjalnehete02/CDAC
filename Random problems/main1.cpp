#include<iostream>
#include<cmath>
using namespace std;


int main(){


    int coinSum;
    cout<<"Enter the coin total amount";
    cin>>coinSum;
    
    int count = 0;

    int arr[] = {1, 5, 10, 20};

    while(coinSum >= 0){
        int i = 1;
        if(coinSum >= arr[sizeof(arr) - i]){
            coinSum = coinSum - arr[sizeof(arr) -i];
        }
        count++;
        i--;
    }

    return 0;
}