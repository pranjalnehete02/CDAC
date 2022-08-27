#include<iostream>
using namespace std;

void reversearr(int arr[], int n){
    int l=0, h=n-1;

    //Swaping of last nodes
    while(l<h){
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
        l++;
        h--;
    }
}

int main(){

    int arr[]={1,2,3,4,5,6,7,8};
    
    for(int i=0;i<8;i++){
        cout<<arr[i]<<" ";
    }
    cout<<"\n";

    reversearr(arr,8);

    for(int i=0;i<8;i++){
        cout<<arr[i]<<" ";
    }

    return 0;
}