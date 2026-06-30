public class CheckDivisibilityByDigitSumAndProduct{
    public boolean checkDivisibility(int num) {    
        int sum=0;
        int mul=1;
        int n=num;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            mul*=temp;
            n/=10;
        }
        return num%(sum+mul)==0;
    }
}
