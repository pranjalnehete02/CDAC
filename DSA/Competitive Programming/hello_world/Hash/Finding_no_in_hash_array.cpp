#include<iostream>
#include<math.h>
using namespace std;
#define MAX 1000

bool hash_table[MAX+1][2];

bool search(int x){
    if(x >= 0){
        if(hash_table[x][0] == 1){
            return true;
        }
        else{
            return false;
        }
    }else{
        x = abs(x);
        if(hash_table[x][1] == 1){
            return true;
        }
        else{
            return false;
        }
    }
}

void insert(int a[], int n){
    for(int i = 0; i<n ; i++){
        if (a[i] >= 0){
            hash_table[a[i]][0] == 1;
        }
        else{
            hash_table[abs(a[i])][1] == 1;
        }
    }
}

int main(){

    int arr[] = {-1, 9, 2, -5, 3, 1};
    int n = sizeof(arr)/sizeof(arr[0]);
    insert(arr, n);

    int find = -3;
    if(search(find)){
        cout<<"element is present"<<endl;
    }else{
        cout<<"Element is not present"<<endl;
    }

    return 0;


 
}