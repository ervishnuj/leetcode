class MinimumSwapsToMoveZerosToEnd {
    public int minimumSwaps(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int swap=0;
        while(left<right){
        while(left<right&&nums[left]!=0){
            left++;
        }
        while(left<right&&nums[right]==0){
            right--;
        }
        // int temp=nums[left];
        if(nums[left]==0&&nums[right]>0){
            nums[left]=nums[right];
            nums[right]=0;
            swap++;
        }
        
        left++;
        right--;
        }
        return swap;
    }
}
