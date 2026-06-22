public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int res=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            int num=nums[i];
            int digit=0;
            if(num==0)digit=1;
            else{
                while(num>0){
                    num/=10;
                    digit++;
                }
            }
            if(digit%2==0)res++;
        }
        return res;
    }

    // public int findNumbers(int[] nums) {
    //     int res=0;
    //     int len=nums.length;
    //     for(int i=0;i<len;i++){
    //         if((nums[i]+"").length()%2==0)res++;
    //     }
    //     return res;
    // }
}
