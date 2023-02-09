#include<iostream>
using namespace std;

    bool ispossible(int arr[], int k, int mid){
        int cowCount = 1;
        int lastPos = arr[0];

        for(int i = 0; i < 5; i++){
            if(arr[i] - lastPos >= mid){
                cowCount++;
                if(cowCount == k){
                    return true;
                }
            }
        }
        return false;
    }


int main(){

    int stalls[5] = {1,2,3,4,6};

    int start = 0;
    int maxi = -1;
    int ans = -1;

    for(int i = 0; i < 5; i++){
        maxi  = max(maxi, stalls[i]);
    }

    int end = maxi;
    int mid = (start + end)/2;

    while(start <= end){
        if(ispossible(stalls, 2 ,mid)){
            ans = mid;
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
        mid = (start + end)/2;
    }
    return ans;

    return 0;
}