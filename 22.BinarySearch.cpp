#include<iostream>
using namespace std;

int pivotarrayindex(int arr[],int size){
    int start = 0;
    int end = size - 1;
    int mid = (start + end)/2;

    while(start < end){
        if(arr[mid] >= arr[0]){
            start = mid + 1;
        }
        else{
            end = mid;
        }
        mid = (start + end)/2;
    }
    return start;
}


int main(){

    int arry[6] = {4,5,6,1,2,3};

    cout<<"The pivot element index is "<<pivotarrayindex(arry,6)<<endl;

    return 0;
}