public class FindGreatestCommonDivisorOfArray {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int n=nums.length;
        for(int i =1;i<n;i++){
            if(min>nums[i])min=nums[i];
            if(max<nums[i])max=nums[i];
        }
        int original=min;
        while(original>1){
            if(min%original==0&&max%original==0)return original;
            original--;
        }
        return 1;
    }
}
