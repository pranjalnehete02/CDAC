#include<iostream>
#include<queue>

using namespace std;

void printTheNum(priority_queue<int> q){
    priority_queue<int> pq = q;
    while(!pq.empty()){
        cout<<pq.top()<<endl;
        pq.pop();
    }
    cout<<endl;
}

int main(){

    priority_queue<int> pq;

    pq.push(34);
    pq.push(72);
    pq.push(17);
    pq.push(96);
    pq.push(41);

    printTheNum(pq);

    cout<<pq.size()<<endl;

    pq.pop();

    printTheNum(pq);

    cout<<"Is the queue is empty or nor?  "<<pq.empty();

}