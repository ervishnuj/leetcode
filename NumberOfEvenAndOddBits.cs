public class NumberOfEvenAndOddBits {
    public int[] EvenOddBit(int n) {
        int[] res=new int[]{0,0};
        for(int i=0;0<n;i++){
            if(n%2==1){
                if(i%2==0)res[0]++;
                else res[1]++;
            }
            n/=2;
        }
        return res;
    }
}
