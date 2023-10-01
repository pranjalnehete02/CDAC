#include<iostream>
#include<queue>

using namespace std;

void printElementOfQueue(queue<int> q){
    while(! q.empty()){
        cout<<q.front()<<endl;
        q.pop();
    }
}

int main(){

    queue<int> q;

    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    q.push(6);

    cout<<q.empty()<<endl;
    cout<<q.size()<<endl;
    cout<<endl;

    printElementOfQueue(q); 

}