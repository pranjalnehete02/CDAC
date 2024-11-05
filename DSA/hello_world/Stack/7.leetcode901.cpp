/*

Design an alogorith that collects daily price stocks 
and return the span of the stock price for the current day.


we are given the price of the stock of every day
and we are asked to find the span that is we have to find how many previous
days including current the stock min
SPAN : No. of previous consecutive days including current day
       that is minimum span will be 1 becase there's current day is included

    Eg.
    I/p : <100,80,60,70,60,75,85>
    O/p : <1  ,1 ,1 ,2 ,1 ,4 ,6 >





                                Naive approch:  

for(int i = 0; i < n; i++){
    int span = 1;
    for(int j = i-1; j >=0 && arr[j] <= arr[i]; j--){
        span++;
    }
    cout<<span;
}






                                standard approch:


stack<pair<int,int>>st;
Stockspanner(){

}
int next(int price){
    int span = 1;

    while(!st.empty() && st.top().first <= price){
        span += st.top().second;
        st.pop();
    }

    st.push({price, span});
    return span;
}



*/