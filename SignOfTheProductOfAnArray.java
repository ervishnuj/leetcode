public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        
        int res=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)return 0;
            else if(nums[i]<0)res*=-1;
        }
        return res>0?1:-1;
    }
}
