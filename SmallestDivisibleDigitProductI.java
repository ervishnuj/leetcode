class SmallestDivisibleDigitProductI {
    public int smallestNumber(int n, int t) {
        for(int i=0;i<101;i++){
            int x=n+i;
            int res=1;
            while(x>0){
                res*=x%10;
                if(res==0)return n+i;
                x/=10;
            }
            if(res%t==0)return n+i;

        }
        return n;
        
    }
}
