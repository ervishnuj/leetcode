public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        // if(n==2){
        //     // arr={1,1};
        //     arr[0]=1;
        //     arr[1]=1;
        // }else{
            
            for(int i=1;i<n;i++){
                if(!hasZero(i)&&!hasZero(n-i)){
                    arr[0]=i;
                    arr[1]=n-i;
                    break;
                }
            }
        // }
        return arr;
    }
    private boolean hasZero(int n){
        while(n>0){
            if(n%10==0)return true;
            n/=10;
        }
        return false;
    }
}
