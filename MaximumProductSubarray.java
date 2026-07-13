public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int ans = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int temp = currentMax;
            currentMax = Math.max(nums[i], Math.max(currentMax * nums[i], currentMin * nums[i]));
            currentMin = Math.min(nums[i], Math.min(temp * nums[i], currentMin * nums[i]));
            ans = Math.max(ans, currentMax);
        }
        return ans;
        // int currentSum=nums[0];
        // int maxSum=nums[0];
        // for(int j=0;j<nums.length;j++){
        // currentSum=nums[j];
        // maxSum=Math.max(currentSum,maxSum);
        // for(int i=j+1;i<nums.length;i++){
        // currentSum*=nums[i];
        // maxSum=Math.max(currentSum,maxSum);
        // }
        // }
        // return maxSum;
    }
}
