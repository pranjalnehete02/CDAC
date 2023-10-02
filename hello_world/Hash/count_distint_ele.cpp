#include<iostream>
using namespace std;


int count(int a[], int n ){
    int count_ele = 0;
    for(int i = 0; i < n; i++){
        bool flag = false;
        for(int j = 0; j < i; j++){
            if(a[i] == a[j]){
                flag = true;
                break;
            }

        }
        if(flag == false){
            count_ele++;
        }
        
    }

    return count_ele;


}

int main(){

    int a[] = {10, 20, 10, 20, 30};

    count(a, 5);

    return 0 ;
}