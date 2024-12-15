//we have to find the count of distinct common elements in 2 arrays
#include<iostream>
#include<unordered_set>

using namespace std;

int intersection(int a[], int b[], int m, int n){

/*
This following code is for insertion of elements in the unordered set
As we know the unordered set doesn't insert the same elemetns twice
Hence the arr[] will be :     {10, 15,  20, 30, 5} 
*/
    unordered_set<int> s;
    for(int i = 0; i < m; i++){
        s.insert(a[i]);
    }
/*
This following code is for the comparision for the elem in hashset and arr2[]
if we found the elem in the arr we increment the result and remove it from the hashset
*/
    int res = 0;
    for(int j = 0; j < n; j++){
        if(s.find(b[j]) != s.end()){
            res++;
            s.erase(b[j]);
        }
    }
    return res;

}


int main(){

    int arr[] = {10, 15, 20, 15, 30, 30, 5};
    int arr2[] = {30, 5, 30, 80};

    intersection(arr, arr2, 7, 4);
 
}