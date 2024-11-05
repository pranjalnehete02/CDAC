#include<bits/stdc++.h>
using namespace std;

    string ReverseOrderOfString(string inputString) {

        if(inputString.size()==0){
            cout<<inputString;
        }
        stack<string> mystack;
        string result;

        for(int i=0; i<inputString.size(); i++){
            string word;
            if(inputString[i]==' '){
                continue;
            }
            while(i<inputString.size() && inputString[i]!=' '){
                word=word+inputString[i];
                i++;
            }
            mystack.push(word);
        }
        while(!mystack.empty()){
            
            result=result + mystack.top();
            mystack.pop();
            if(!mystack.empty()){
                result+=' ';
            }
        }
        cout<<result<<endl;
        
    };

int main(){
    int tc;
    cin>>tc;
    string s;
    tc=tc+1;
 while(tc--){
getline(cin,s);
ReverseOrderOfString(s);
 }
return 0;
}