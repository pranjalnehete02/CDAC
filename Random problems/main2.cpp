#include<iostream>
using namespace std;

int printname(int n){
    if(n == 0){
        return 0;
    }

    cout<<"Pranjal";
    printname(n--);

}


int main(){

    printname(5);


    return 0;
}