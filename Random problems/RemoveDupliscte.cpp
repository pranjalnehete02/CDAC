#include <bits/stdc++.h>
using namespace std;
class ListNode{
   public:
      int val;
      ListNode *next;
      ListNode(int data){
         val = data;
         next = NULL;
      }
};
ListNode *make_list(vector<int> v){
   ListNode *head = new ListNode(v[0]);
   for(int i = 1; i<v.size(); i++){
      ListNode *ptr = head;
      while(ptr->next != NULL){
         ptr = ptr->next;
      }
      ptr->next = new ListNode(v[i]);
   }
   return head;
}
void print_list(ListNode *head){
   ListNode *ptr = head;
   cout << "[";
   while(ptr){
      cout << ptr->val << ", ";
      ptr = ptr->next;
   }
   cout << "]" << endl;
}
class Solution {
public:
   ListNode* deleteDuplicates(ListNode* head) {
      ListNode*dummy = new ListNode(INT_MIN);
      dummy->next = head;
      ListNode * curr = dummy;
      while(curr){
         ListNode * next = curr->next;
         while(next && next->val==curr->val)
            next = next->next;
         curr->next = next;
         curr=next;
      }
      return dummy->next;
   }
};
main(){
   Solution ob;
   vector<int> v = {1,1,2,3,3,3,4,5,5};
   ListNode *head = make_list(v);
   print_list(ob.deleteDuplicates(head));
}   