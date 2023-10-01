#include<iostream>
#include<list>

using namespace std;

void printList(list<int> list1){
    list<int> :: iterator ptr;
    for(ptr = list1.begin(); ptr != list1.end(); ptr++){
        cout<<*ptr<<" ";
    }
    cout<<endl;
}




int main(){

    list<int> l;

    list<int> :: iterator ptr;

    l.push_back(9);
    l.push_back(2);
    l.push_back(-7);
    l.push_back(3);

    ptr = l.begin();
    cout<<*ptr<<endl;

    printList(l);


    l.pop_back();

    printList(l);

    cout<<"Front : "<<l.front()<<endl;
    cout<<"Back : "<<l.back()<<endl;

    l.erase(l.begin());
    printList(l); 

    l.clear();

    cout<<"empty or not ?"<<l.empty();

}