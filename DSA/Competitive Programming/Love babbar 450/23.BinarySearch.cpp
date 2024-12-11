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

int BinarySearch(int arr[],int s, int e, int key){
    int start = s;
    int end = e;
    int mid = (start + end)/2; 

    while(start <= end){
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid] > key){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
        mid = (start + end)/2;
    }
    return -1;
}    

int main(){
    
    int arry[6] = {4,5,6,1,2,3};
    int k;
    cin>>k;

    int pivot = pivotarrayindex(arry, 6);

    if( k >= arry[pivot] && k <= arry[5])
    {//BS on second line
        return BinarySearch(arry, pivot, 5, k);
    }
    else
    {//BS on first line
        return BinarySearch(arry, 0, pivot - 1, k);
    }
    return 0;
}