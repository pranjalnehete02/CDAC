#include<iostream>
#include<unordered_set>

using namespace std;

int count_dist(int arr[], int n){

    unordered_set<int> s;
    for(int i = 0; i < n; i++){
        s.insert(arr[i]);
    }
    return s.size();

}

int main(){

    int a[] = {10, 20, 10, 20, 30};

    count_dist(a, 5);

    return 0 ;
}