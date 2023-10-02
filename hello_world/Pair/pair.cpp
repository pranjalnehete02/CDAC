#include<iostream>
#include<utility>

using namespace std;

int main(){


    //                      first way to initialize
    pair<int, char> p1;
    p1.first = 100;
    p1.second = 'A';
    cout<<p1.first<<" "<<p1.second<<endl;

    //                      Second way to initialize
    pair<int, string> p2(2, "Pranjal");
    cout<<p2.first<<" "<<p2.second<<endl;

    //                      Third way to initialize
    pair<string, double> p3;
    p3 = make_pair("Avanti", 95.3);
    cout<<p3.first<<" "<<p3.second<<endl;

    pair<int, int> p4 = make_pair(3,5);
    pair<int, int> p5 = make_pair(5,1);
    cout<<p4.first<<"  "<<p4.second<<endl;
    cout<<p5.first<<"  "<<p5.second<<endl;

    //                  coping the elemetns into another
    pair<int, int> p5(p4);
    cout<<p5.first<<"  "<<p5.second<<endl;


    


}