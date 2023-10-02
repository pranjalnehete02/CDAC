#include<iostream>
#include<unordered_map>

using namespace std;

int firstnonRepeating(int arr[], int n){

    unordered_map<int, int> un;
    for(int i=0; i<n; i++){
        un[arr[i]]++;
    }

    for(int i=0; i<n; i++){
        int key = arr[i];
        auto temp = un.find(key);

        if(temp->second == 1){
            return key;
                             }
    }
    return 0;

}


int main(){

    int arr[] = {1, 1, 1};

}