#include<iostream>
using namespace std;

int freq_count(int arr[], int n, int x){
    int count = 0;
    for(int i = 0; i < n; i++){
        if(x == arr[i]){
            count++;
        }
    }
    return count;
}


int main(){

    int arr[5] = {10, 10, 10, 2};

    freq_count(arr, 4, 10);

    return 0;
}