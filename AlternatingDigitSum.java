public class AlternatingDigitSum {
     public int alternateDigitSum(int n) {
        int res=0;
        // int i=0;
        String s=n+"";
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(i%2==0){
                res+=digit;
            }else{
                res-=digit;
            }
        }
        // while(n>0){
        //     if(i++%2==0)
        //     res+=n%10;
        //     else
        //     res-=n%10;
        //     n/=10;
        // }
        // return Math.abs(res);
        return res;
    }
}
