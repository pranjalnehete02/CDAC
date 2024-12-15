#include<iostream>
using namespace std;

int main(){

    int m = 0;
    int n = 0;

    int sum = 0;

    int arr[m][n];    

    cout<<"Enter the elememts : ";
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            cin>>arr[i][j];
        }
    }

    for(int i = 0; i < m -2; i++){
        for(int j = 0; j < n-2; j++){
            sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        }
    }

    cout<<sum;
    

    return 0;
}