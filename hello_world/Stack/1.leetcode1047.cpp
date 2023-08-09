/*

Remove all the adjusting duplicates in the string
and then return the final string after all such duplicates removals has
benn done.
i/p:abbaca
o/p:ca

*/


/*


class solution{
    sting remove_duplicate_string(string s){
        int n = s.size(), i = 0;
        stack<char> st;

        while(i < n){
            if(st.empty || st.top() != s[i])
                st.push(s[i]);
            else
                st.pop();

            i++;
        }

        string ans ="";
        while(!st.empty()){
            char elem = st.top();
            st.pop();

            ans += elem;
        }

        reverse(ans.begin(), ans.end());
        return ans;
    }
}


*/