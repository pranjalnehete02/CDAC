#include<iostream>
using namespace std;

struct student
{
    string name;
    int roll_no;
    int age;

    void student_details(){
        cout<<"Name is "<<name<<endl;
        cout<<"Roll number is "<<roll_no<<endl;
        cout<<"Age is "<<age<<endl;

    }
};


int main(){

    student pranjal;
    pranjal.name = "Sonu";
    pranjal.age = 21;
    pranjal.roll_no = 17;

    pranjal.student_details();

return 0;
}