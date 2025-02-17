#include<iostream>
using namespace std;

int main(){
    int a[] = {1, 5, 10, 20, 40, 80};
    int n1 = sizeof(a)/ sizeof(a[0]);
    int b[] = {6, 7, 20, 80, 100};
    int n2 = sizeof(b)/ sizeof(b[0]);
    int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
    int n3 = sizeof(c)/ sizeof(c[0]);


    int temp[8] = {0,0,0,0,0,0,0,0};

    //temp = b;

    // for(int i = 0; i < n1; i++){
    //     temp[i] = a[i];
    // }


    int k = 0;
    for(int i = 0; i< n1; i++){
        // cout<<"comparing the "<<a[i]<<"with "<<endl;
        for(int j = 0; j < n2; j++){
            // cout<<b[j]<<endl;
            if(a[i] == b[j]){
                temp[k] = a[i];
                k++;
                break;
            }
        }
    }

    for(int i = 0; i < k; i ++){
        for(int j = 0; j < n3; j++){
            if(temp[k] == c[j]){
                temp[k] = c[j];
            }
        }
    }

    for(int i = 0; i < k; i++){
        cout<<temp[i]<<endl;
    }

    
}