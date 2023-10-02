//we are given an array and the sum 
// we have to find the sum of any two elements whose sum is equal to the given sum
//if found then return true otherwise false

#include<iostream>
using namespace std;

int main(){

    int arr[] = {3, 2, 8, 15, -8};
    int main_sum = 17;

    int n = sizeof(arr);
    for(int i = 0; i < n; i++){
        for(int j = i +1; j < n; j++){
            if(arr[i] + arr[j] == main_sum ){
                return true;
            }
            return false;
        }
    }


}