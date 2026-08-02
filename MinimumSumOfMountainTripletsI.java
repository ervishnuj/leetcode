class MinimumSumOfMountainTripletsI{
      public int minimumSum(int[] nums) {
        int result=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[j]&&nums[k]<nums[j]){
                        result=Math.min(result,nums[i]+nums[j]+nums[k]);
                    }
                }
            }
           
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}
