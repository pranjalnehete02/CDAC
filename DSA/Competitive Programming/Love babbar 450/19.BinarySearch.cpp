#include<iostream>
using namespace std;

int FirstOccurance(int arr[], int size, int n){
    int start = 0;
    int end = size - 1;
    int mid = (start + end)/2;
    int ans = -1;

    while(start <= end){
        if(n == arr[mid]){
            ans = mid;
            end = mid - 1; 
        }
        else if (n < arr[mid]){
            end = mid - 1;
        }
        else if (n > arr[mid]){
            start = mid + 1;
        }
        mid = (start + end)/2;
    }
    return ans;
}

int LastOccurance(int arr[], int size, int n){
    int start = 0;
    int end = size - 1;
    int mid = (start + end)/2;
    int ans = -1;

    while(start <= end){
        if(n == arr[mid]){
            ans = mid;
            start = mid + 1; 
        }
        else if (n < arr[mid]){
            end = mid - 1;
        }
        else if (n > arr[mid]){
            start = mid + 1;
        }
        mid = (start + end)/2;
    }
    return ans;
}

int main(){
    int array[9] = {1,2,3,3,3,4,5,5,5}; 

    cout<<"First Occurence of 3 is "<<FirstOccurance(array, 9,3)<<endl;
    cout<<"First Occurence of 3 is "<<LastOccurance(array, 9,3)<<endl;

    return 0;
}