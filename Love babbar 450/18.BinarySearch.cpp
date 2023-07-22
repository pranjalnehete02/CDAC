#include<iostream>
using namespace std;

int binarySearch(int arr[], int size, int n){
    int start = 0;
    int end = size-1;
    int mid = start + (end-start)/2;
    
    while(start <= end)  {
        if(arr[mid] == n){
            return mid;
        }
        if(n > arr[mid]){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
        mid = start + (end-start)/2;
                        }
    return -1;
}

int main(){
    int even[6] = {2,4,6,8,10,12};
    int index = binarySearch(even, 6,10);

    cout<<"index of 10 is "<<index<<endl;

    return 0;
}