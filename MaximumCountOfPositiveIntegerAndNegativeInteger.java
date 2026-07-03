public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0)return Math.max(n-i,count);
            else if(nums[i]<0)count++;
        }
        return count;
    }
}
