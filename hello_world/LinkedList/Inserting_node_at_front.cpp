#include<iostream>
using namespace std;

struct node{
    int data;
    node *next;
};

node  *push(node *head, int newdata){
    node *newnode = new node();
    newnode -> data = newdata;
    newnode -> next = head;

    head = newnode;

    return head;
}



int main(){

node *head = NULL;


head = push(head,5);
head = push(head,7);
head = push(head,4);




    return 0;
}