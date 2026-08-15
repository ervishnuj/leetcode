class LongestSubsequenceWithNonZeroBitwiseXOR {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int total=0;
        boolean ans=false;
        for(int num:nums){
            total^=num;
            if(num!=0) ans=true;
        }
        if(total!=0)return n;
        if(ans)return n-1;
        return 0;

    }
}
