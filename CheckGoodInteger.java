public class CheckGoodInteger {
    public boolean checkGoodInteger(int n) {
        return squareSum(n)-digitSum(n)>=50;
    }
    private int digitSum(int val){
        int res=0;
        while(val>0){
            res+=val%10;
            val/=10;
        }
        return res;
    } 
    private int squareSum(int val){
         int res=0;
        while(val>0){
            res+=(val%10)*(val%10);
            val/=10;
        }
        return res;
    }
}
