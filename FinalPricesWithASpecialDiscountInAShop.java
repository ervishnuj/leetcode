class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&prices[i]<=prices[st.peek()]){
                int index=st.pop();
                prices[index]-=prices[i];
            }
            st.push(i);
        }
        // for(int i=prices.length-1;i>=0;i--){
        //     st.push(prices[i]);
        // }
        // int temp=0;
        // for(int i=0;i<prices.length;i++){
        //     // st.push(prices[i]);
            
        //     if(prices.length-i==st.size())temp=st.pop();
        //     while(!st.isEmpty()&&temp<=st.peek()){
        //         st.pop();
        //     }
        //     if(!st.isEmpty()){
        //         prices[i]-=st.peek();
        //     }

        // }
        return prices;
    }
}
