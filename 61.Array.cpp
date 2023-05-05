//Printing the maximum sum of the given array
//The time complexcity will be (n)^3.


#include<bits/stdc++.h>
using namespace std;

int main(){

    int arr[] = {1,2,3,4,-5,8,-2,1,-4};
    int n = 9;

    int max_sum = INT_MIN;

    for(int start = 0; start < n; start++){
        for(int end = start; end < n; end++){
            int sum = 0;
            for(int i = start; i <= end; i++){
                sum += arr[i];
            }
            max_sum = max(max_sum, sum);
        } 
    }

    cout<<max_sum;

    return 0;
}