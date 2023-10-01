#include<iostream>
#include<map>

using namespace std;

int main(){

//We're mapping the roll_num and the weight of the student
    map<int, int> person;

    //insert the key and values in map
    //first way
    person.insert(pair<int, int> (1, 35));
    //second way
    person.insert({2,40});
    person.insert({3,49});
    person.insert({6,42});
    person.insert({8,41});


    //print
    for(auto ptr = person.begin(); ptr != person.end(); ++ptr){
        cout<<ptr->first<<"  "<<ptr->second<<endl;
    }

    //  .begin    ----> returns pointer
    //this will through error    (cout<<person.begin();)

    auto var = person.begin();
    cout<<"By var iterator   "<<var->first<<"  "<<var->second<<endl;


//end()
    auto var1 = person.end();
    cout<<"By var1 iterator   "<<var1->first<<"  "<<var1->second<<endl;

//size()   ----> return size of map
    cout<<person.size()<<endl;
    cout<<person.max_size()<<endl;


//find() ----> find it and returns the pointer to iterator
//             it is same as the begin()
//erase()
//                          First way
    auto it = person.find(3);
    person.erase(it);

    for(auto ptr = person.begin(); ptr != person.end(); ++ptr){
        cout<<ptr->first<<"  "<<ptr->second<<endl;
    }

//                          Second Way

    person.erase(8);


//empty() ----> weather map is  empty or not
cout<<"Map is empty or not ? "<<person.empty()<<endl;

//clear() -----> delete all values in map

    person.clear();
    cout<<"Map is empty or not ? "<<person.empty()<<endl;




}