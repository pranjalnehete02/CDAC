#include<iostream>
using namespace std;

int squrt_perfect(int n){
    int start = 0;
    int end = n-1;
    int mid = (start + end)/2;

    int ans = 0;

    while(start <= end){

    int square = mid*mid;

    if(square == n){
        return mid;
    }
    else if(square < n){
        ans = mid;
        start = mid + 1;
    }
    else{
        end = mid - 1;
    }

    mid = (start + end)/2;

    }
    return ans;


}

int main(){

    int n;
    cout<<"Enter the value of n(Perfect square)"<<endl;
    cin>>n;

    int answer = squrt_perfect(n);
    cout<<answer;

    return 0;
}