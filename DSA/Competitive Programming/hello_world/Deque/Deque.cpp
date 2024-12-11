#include<iostream>
#include<deque>

using namespace std;


void printTheNum(deque<int> q){
    deque<int>  :: iterator ptr;
    for(ptr = q.begin(); ptr != q.end(); ptr++){
        cout<<*ptr<<" ";
    }
    cout<<endl;

}

int main(){

    deque<int> dq;

    dq.push_back(23);
    dq.push_back(12);

    dq.push_front(54);
    dq.push_front(72);

    printTheNum(dq);

    cout<<"The size of deque is  "<<dq.size()<<endl;
    cout<<"Maximum elements can be stored are  "<<dq.max_size()<<endl;

    cout<<dq.at(2)<<endl;
    cout<<dq.front()<<endl;
    cout<<dq.back();

    dq.pop_front();
    cout<<endl;
    printTheNum(dq);

    dq.pop_back();
    cout<<endl;
    printTheNum(dq);


}