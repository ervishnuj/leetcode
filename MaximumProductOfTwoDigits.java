class Solution {
    public int maxProduct(int n) {
        
        int fir=-1;
        int sec=-1;
        while(n>0){
            int res=n%10;
            
            if(fir<res){
                sec=fir;
                fir=res;}
            else if(sec<res&&res<=fir)sec=res;
            n/=10;
        }
        if(fir<=0||sec<=0)return 0;
        // else if(sec<=0)return fir;
        return fir*sec;
       
    }
}
