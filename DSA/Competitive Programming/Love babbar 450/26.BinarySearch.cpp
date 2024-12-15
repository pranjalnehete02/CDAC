#include<iostream>
using namespace std;

bool ispossible(int array[], int n, int m, int mid){
    int studentCount = 1;
    int pageSum = 0;

    for(int i = 0; i<n; i++) {
        if(pageSum + array[i] <= mid) {
            pageSum += array[i];
        }
        else
        {
            studentCount++;
            if(studentCount > m || array[i] > mid ) {
            return false;
        }
            pageSum = array[i];
        }
        if(studentCount > m) {
            return false;
        }
        cout << " for i " << i << " Student "<< studentCount << " pageSum " << pageSum << endl;
    }
    return true;

}


int main(){

    int array[4] = {10,20,30,40};

    int n,m;
    int start = 0;
    int sum = 0;
    int ans = -1;

    for(int i = 0; i<=3; i++){
        sum += array[i];
    }

    int end  = sum;
    int mid  = (start + end)/2;

    while(start <= end){
        if(ispossible(array, 4, 2, mid)){
            ans = mid;
            end = mid - 1;
        }
        else{
            start = mid - 1;
        }
        mid = (start + end)/2;
    }
    return ans;

    return 0;
}