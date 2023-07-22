#include<iostream>
using namespace std;

int squrt_temp(int n){
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

double perfect_squrt(int n, int precision, int temp_sol){

    double factor = 1;
    double ans = temp_sol;

    for (int i = 0; i<precision; i++){
        factor = factor/10;
        for (double j = ans; j*j<n; j = j + factor){
            ans = j;
        }
    }
    return ans;
}

int main(){

    int n;
    cout<<"Enter the value of n"<<endl;
    cin>>n;

    int temp_sol = squrt_temp(n);
   
    cout<<"Answer is "<<perfect_squrt(n, 4, temp_sol)<<endl;

    return 0;
}