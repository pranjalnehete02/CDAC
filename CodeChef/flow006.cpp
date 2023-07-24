
/*

Problem
You're given an integer N. Write a program to calculate the sum of all the
digits of N.

                        TRADITIONAL METHOD 1
#include<iostream>
using namespace std;

int main(){

    int x, sum=0; cin>>x;
    while(x>0){
        sum = sum + x%10;
        x = x/10;
    }
    
    cout<<sum<<endl;
    return 0;
}


*/


#include<iostream>
using namespace std;

int findSum(string str)
{
int sum = 0;
for (char ch : str)
{
if (isdigit(ch))
{
sum += ch - '0';
}
}
return sum;
}
int main()
{
string str="Pr22e44pinsta";
cout << "Sum :" << findSum(str) << endl;
}