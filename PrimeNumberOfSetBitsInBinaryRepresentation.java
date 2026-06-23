public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        while(left<=right){
            int temp=left;
            int even=0;
            while(temp>0){
                if(temp%2==1)even++;
                temp/=2;
                
            }
            if(even==2||even==3||even==5||even==7||even==11||even==13||even==17||even==19||even==23||even==29||even==31||even==37)res++;
            left++;
        }
        return res;
    }
}
