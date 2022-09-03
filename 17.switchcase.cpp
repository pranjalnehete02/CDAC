//17.switchcase.cpp
#include<iostream>
#include<math.h>
using namespace std;


int main(){
    int n;
    cin>>n;

    switch ( n ) {
        case 1 : cout << "First" << endl;
        break;

        case 2: cout << "Second" << endl;
        break;

        default : cout << "This is default" << endl;
    }

return 0;
}